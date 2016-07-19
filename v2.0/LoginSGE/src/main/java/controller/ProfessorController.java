package controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Aluno;
import classes.Professor;
import dao.AlunoDao;
import dao.ProfessorDao;

@WebServlet("/CadastrarDocente")
public class ProfessorController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int matricula = Controller.toInt(req, "matricula", "0");
			String nome = Controller.valor(req, "fullname", "");
			String cpf = Controller.valor(req, "cpf", "");
			String sexo = Controller.valor(req, "teacherSex", "");

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				ProfessorDao.InserirProfessor(nome, cpf, sexo);
				msg = "Inclusão realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDocente");
			} else if (op.equals("iniciarAlteracao")){
				Professor p = ProfessorDao.getProfessor(matricula);
				req.setAttribute("professor", p);
				req.setAttribute("operacao", "iniciarAlteracao");
				
				req.getRequestDispatcher("cadastro_docente.jsp").forward(req, resp);				
				return;
				
			} else if (op.equals("alterar")) {
				ProfessorDao.AlterarProfessor(matricula, nome, cpf, sexo);
				msg = "Alteração realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDocente");
			} else if (op.equals("excluir")) {
				ProfessorDao.ExcluirProfessor(matricula); 
				msg = "Exclusão realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDocente");
			} else if (op.equals("")) {
				msg = "";
				resp.sendRedirect("cadastro_docente.jsp");
				return;
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			req.setAttribute("msg", msg);
			//req.getRequestDispatcher("cadastro_docente.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
