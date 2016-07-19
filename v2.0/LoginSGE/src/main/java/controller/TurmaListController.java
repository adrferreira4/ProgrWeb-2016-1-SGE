package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Professor;
import classes.Turma;
import dao.ProfessorDao;
import dao.TurmaDao;

@WebServlet("/GestaoTurma")
public class TurmaListController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Turma> turmas;
		try {
			turmas = TurmaDao.listar();
		}  catch (Throwable e) {
			turmas = null;
		}
		req.setAttribute("Turmas", turmas);
		
		req.getRequestDispatcher("gestao_turma.jsp").forward(req, resp);
	}
}
