package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Padrao.AlunoDao;

public class AlunoController extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int matricula = Controller.toInt(req, "matricula", "0");
			String nome = Controller.valor(req, "nome", "");
			int serie = Controller.toInt(req, "serie", "0");
			
			//Checagem e execu��o da opera��o
			if (op.equals("incluir")) {
				dao.AlunoDao.InserirAluno(matricula, nome, serie); 
				msg = "Inclus�o realizada com sucesso.";
			} else if (op.equals("alterar")) {
				AlunoDao.alterar(matricula, nome);
				msg = "Alteração realizada com sucesso.";
			} else if (op.equals("excluir")) {
				AlunoDao.excluir(matricula);
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
