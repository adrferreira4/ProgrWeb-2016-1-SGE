package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DisciplinaDao;


public class DisciplinaController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int codigo = Controller.toInt(req, "codigo", "0");
			String nome = Controller.valor(req, "nome", "");

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				DisciplinaDao.InserirDisciplina(codigo, nome); 
				msg = "Inclusão realizada com sucesso.";
			} else if (op.equals("alterar")) {
				DisciplinaDao.AlterarDisciplina(codigo, nome);
				msg = "AlteraÃ§Ã£o realizada com sucesso.";
			} else if (op.equals("excluir")) {
				DisciplinaDao.ExlcuirDisciplina(codigo);
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
