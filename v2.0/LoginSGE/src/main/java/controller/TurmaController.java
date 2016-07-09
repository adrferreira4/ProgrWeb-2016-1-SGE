package controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProfessorDao;
import dao.TurmaDao;

public class TurmaController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int codigo = Controller.toInt(req, "matricula", "0");
			int Matr_Prof = Controller.toInt(req, "matriculaProfessor", "");
			int serie = Controller.toInt(req, "serie", "");
			int ano = Controller.toInt(req, "ano", "");

			
			//Checagem e execu��o da opera��o
			if (op.equals("incluir")) {
				TurmaDao.InserirTurma(codigo, Matr_Prof, serie, ano);
				msg = "Inclus�o realizada com sucesso.";
			} else if (op.equals("alterar")) {
				TurmaDao.AlterarTurma(codigo, Matr_Prof, serie, ano);
				msg = "Alteração realizada com sucesso.";
			} else if (op.equals("excluir")) {
				TurmaDao.ExcluirTurma(codigo);
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
