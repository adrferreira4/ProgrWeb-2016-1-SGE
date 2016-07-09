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

			
			//Checagem e execu��o da opera��o
			if (op.equals("incluir")) {
				ProfessorDao.InserirProfessor(matricula, nome, cpf, sexo);
				msg = "Inclus�o realizada com sucesso.";
			} else if (op.equals("alterar")) {
				ProfessorDao.AlterarProfessor(matricula, nome, cpf, sexo);
				msg = "Alteração realizada com sucesso.";
			} else if (op.equals("excluir")) {
				ProfessorDao.ExcluirProfessor(matricula); 
				msg = "Exclusão realizada com sucesso.";
			} else if (op.equals("")) {
				msg = "";
			} else {
				throw new IllegalArgumentException("Opera��o \"" + op + "\" n�o suportada.");
			}
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("AlunoView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
