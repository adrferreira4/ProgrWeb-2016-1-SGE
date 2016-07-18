package controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import classes.Aluno;
import dao.AlunoDao;

@WebServlet("/GestaoDiscentes")
public class AlunoListController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Aluno> alunos;
		try {
			alunos = AlunoDao.listar();
		}  catch (Throwable e) {
			alunos = null;
		}
		req.setAttribute("Alunos", alunos);
		
		req.getRequestDispatcher("gestao_discente.jsp").forward(req, resp);
		
	}

}
