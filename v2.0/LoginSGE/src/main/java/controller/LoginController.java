package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/login")
public class LoginController extends HttpServlet{
	
private static final String URL = "jdbc:derby:db;create=true";
	
	private String valor(HttpServletRequest req, String param, String padrao) {
		String result = req.getParameter(param);
		if (result == null) {
			result = padrao;
		}
		return result;
	}

	private int toInt(HttpServletRequest req, String param, String padrao) {
		return Integer.parseInt(valor(req, param, padrao));
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String msg = "";
		String op = valor(req, "operacao", "");
		String usuario = valor(req, "username", "");
		String senha = valor(req, "password", "");
		
		try {
			if (op.equals("Login")) {
				Connection conn = DriverManager.getConnection(URL);
				// Executar instrução SQL.
				String sql = "SELECT * FROM USUARIOS WHERE NOME =?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, usuario);
				ResultSet busca = pstmt.executeQuery();
				
				if(!busca.next()) msg = "Este usu�rio n�o est� cadastrado.";
				else{
				
					if (senha.equals(busca.getString(2))) {

						//Obter a sessão.
						HttpSession session = req.getSession();
						//Incluir variável na região de memória da sessão.
						session.setAttribute("usuario", usuario);
						
						resp.sendRedirect("index.html");
					} else {
						msg = "Usu�rio ou senha incorreta. " + usuario + " " + busca.getString(1);
					}
				}
			} else if (op.equals("")) {
				msg = "";
				req.getRequestDispatcher("login.html").forward(req, resp);
			} 
			
			/*else if(op.equals("cadastroUsuario")){
				UsuarioDao.CadastrarUsuario(usuario, senha);
			}*/
			
			else {
				throw new IllegalArgumentException("Operação \"" + op + "\" não suportada.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		req.setAttribute("msg", msg);
		
	}

}
