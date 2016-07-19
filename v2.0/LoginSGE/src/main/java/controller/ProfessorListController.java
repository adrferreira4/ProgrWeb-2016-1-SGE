package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Professor;
import dao.ProfessorDao;

@WebServlet("/GestaoDocente")
public class ProfessorListController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Professor> docentes;
		try {
			docentes = ProfessorDao.listar();
		}  catch (Throwable e) {
			docentes = null;
		}
		req.setAttribute("Professores", docentes);
		
		req.getRequestDispatcher("gestao_docente.jsp").forward(req, resp);
	}
}
