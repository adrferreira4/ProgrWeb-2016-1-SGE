package controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Turma;
import dao.TurmaDao;

@WebServlet("/CadastrarTurma")
public class TurmaController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int codigo = Controller.toInt(req, "code", "0");
			int Matr_Prof = Controller.toInt(req, "teacherID", "0");
			int serie = Controller.toInt(req, "grade", "1");
			int ano = Controller.toInt(req, "year", "2016");

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				TurmaDao.InserirTurma(Matr_Prof, serie, ano);
				msg = "Inclusão realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoTurma");
			} else if (op.equals("iniciarAlteracao")){
				Turma t = TurmaDao.getTurma(codigo);
				req.setAttribute("turma", t);
				req.setAttribute("operacao", "iniciarAlteracao");
				
				req.getRequestDispatcher("cadastro_turma.jsp").forward(req, resp);				
				return;
			} else if (op.equals("alterar")) {
				TurmaDao.AlterarTurma(codigo, Matr_Prof, serie, ano);
				msg = "Alteração realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoTurma");
			} else if (op.equals("excluir")) {
				TurmaDao.ExcluirTurma(codigo);
				msg = "Exclusão realizada com sucesso.";

				resp.sendRedirect("/ProgrWeb/GestaoTurma");
			} else if (op.equals("")) {
				msg = "";
				req.getRequestDispatcher("cadastro_turma.jsp").forward(req, resp);
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
				
			}
			req.setAttribute("msg", msg);
			//req.getRequestDispatcher("AlunoView.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace(resp.getWriter());
		}
	}
}
