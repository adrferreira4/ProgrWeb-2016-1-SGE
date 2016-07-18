package controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDao;

public class ProfessorController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int matricula = Controller.toInt(req, "matricula", "0");
			String nome = Controller.valor(req, "nome", "");
			String cpf = Controller.valor(req, "cpf", "");
			String sexo = Controller.valor(req, "sexo", "");

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				ProfessorDao.InserirProfessor(nome, cpf, sexo);
				msg = "Inclusão realizada com sucesso.";
			} else if (op.equals("alterar")) {
				ProfessorDao.AlterarProfessor(matricula, nome, cpf, sexo);
				msg = "AlteraÃ§Ã£o realizada com sucesso.";
			} else if (op.equals("excluir")) {
				ProfessorDao.ExcluirProfessor(matricula); 
				msg = "ExclusÃ£o realizada com sucesso.";
			} else if (op.equals("")) {
				msg = "";
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("AlunoView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
