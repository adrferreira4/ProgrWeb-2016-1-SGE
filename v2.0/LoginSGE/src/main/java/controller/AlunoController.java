package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Aluno;
import dao.AlunoDao;

@WebServlet("/CadastrarDiscente")
public class AlunoController extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg = "";
			DateFormat formatadorDeData = new SimpleDateFormat("dd-mm-yyyy");
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int matricula = Controller.toInt(req, "matricula", "0");
			String nome = Controller.valor(req, "fullname", "");
			String nomeMae = Controller.valor(req, "mothername", "");
			String nomePai = Controller.valor(req, "fathername", "");
			String cep = Controller.valor(req, "cep", "");
			String endereco = Controller.valor(req, "endereco", "");
			Date dtNascimento = Controller.toDate(req,"dataNascimento");

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				AlunoDao.InserirAluno(nome, nomeMae, nomePai, cep, endereco, dtNascimento); 
				msg = "Inclusão realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDiscentes/");
			} else if (op.equals("iniciarAlteracao")){
				Aluno a = AlunoDao.getAluno(matricula);
				req.setAttribute("aluno", a);
				req.setAttribute("operacao", "iniciarAlteracao");
				
				req.getRequestDispatcher("cadastro_discente.jsp").forward(req, resp);				
				return;
			} else if (op.equals("alterar")) {
				AlunoDao.AlterarAluno(matricula, nome, nomeMae, nomePai, cep, endereco, dtNascimento);
				msg = "Alteração realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDiscentes");
			} else if (op.equals("excluir")) {
				AlunoDao.ExlcuirAluno(matricula);
				msg = "Exclusão realizada com sucesso.";
				resp.sendRedirect("/ProgrWeb/GestaoDiscentes");
			} else if (op.equals("")) {
				msg = "";

				req.getRequestDispatcher("cadastro_discente.jsp").forward(req, resp);
				
				return;
			} else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			req.setAttribute("msg", msg);
			
			List<Aluno> alunos = AlunoDao.listar();
			req.setAttribute("getAlunos", alunos);
			
			req.getRequestDispatcher("/GestaoDiscentes").forward(req, resp);
		} catch (Exception e) {
			String mensagem = e.getMessage();
			e.printStackTrace(resp.getWriter());
		}
	}
}
