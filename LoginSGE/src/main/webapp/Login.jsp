<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="UTF-8" />
<title>SGE - Login</title>
</head>
<body>
	<div class="container">
		<div class="codrops-top">
			<strong>SGE - Sistema de Gestao Escolar </strong>
		</div>
		<section>
		<div id="container_demo">
		
			<div id="wrapper">
				<div id="login" class="animate form">
					<form>
						<h1>Login Administrativo</h1>
						<p>
							<label for="username" class="uname">Usuário </label> 
							<input id="username" name="username" required="required" type="text" placeholder="Insira seu usuário aqui..." />
						</p>
						<p>
							<label for="password" class="youpasswd">Senha </label> 
							<input id="password" name="password" required="required" type="password" placeholder="Insira sua senha aqui..." />
						</p>
						<p class="login button" id="loginButton">
							<input type="button" value="Login" />
						</p>
						<p class="change_link">
							<a href="EsqueceuSenha.jsp" class="to_register">Esqueci minha senha</a>
						</p>
					</form>
				</div>
				
			</div>
		</div>
		<script type="text/javascript">
    			document.getElementById("loginButton").onclick = function () {
        			location.href = "PagInicial.html";
    			};
		</script>
		</section>
	</div>
</body>
</html>
