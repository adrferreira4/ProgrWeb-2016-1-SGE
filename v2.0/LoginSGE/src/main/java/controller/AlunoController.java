package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JSpinner.DateEditor;
import javax.swing.text.DateFormatter;

import Padrao.AlunoDao;

public class AlunoController extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String msg;
			DateFormat formatadorDeData = new SimpleDateFormat("dd-mm-yyyy");
			String op = Controller.valor(req, "operacao", "");
			
			//Parametros
			int matricula = Controller.toInt(req, "matricula", "0");
			String nome = Controller.valor(req, "nome", "");
			String nomeMae = Controller.valor(req, "nomeMae", "");
			String nomePai = Controller.valor(req, "nomePai", "");
			String cep = Controller.valor(req, "cep", "");
			String endereco = Controller.valor(req, "endereco", "");
			Date dtNascimento = formatadorDeData.parse(Controller.valor(req, "dtNascimento", ""));

			
			//Checagem e execução da operação
			if (op.equals("incluir")) {
				dao.AlunoDao.InserirAluno(matricula, nome, serie); 
				msg = "Inclusão realizada com sucesso.";
			} else if (op.equals("alterar")) {
				dao.AlunoDao.AlterarALuno(matricula, nome);
				msg = "AlteraÃ§Ã£o realizada com sucesso.";
			} else if (op.equals("excluir")) {
				dao.AlunoDao.ExlcuirAluno(matricula);
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
