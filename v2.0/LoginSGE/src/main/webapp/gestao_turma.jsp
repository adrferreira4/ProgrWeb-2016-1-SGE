<!DOCTYPE html>
<%@page import="dao.ProfessorDao"%>
<%@page import="classes.Professor"%>
<%@page import="classes.Turma"%>
<%@page import="java.util.List"%>
<html lang="pt">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>SGE</title>

    <!-- Bootstrap CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />
    <!-- full calendar css-->
    <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
    <link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
    <link href="css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
    <link rel="stylesheet" href="css/fullcalendar.css">
    <link href="css/widgets.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
    <link href="css/xcharts.min.css" rel=" stylesheet">
    <link href="css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <script src="js/lte-ie7.js"></script>
    <![endif]-->
</head>

<body>
<!-- container section start -->
<section id="container" class="">


    <header class="header dark-bg">
        <div class="toggle-nav">
            <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
        </div>

        <!--Criação do Logo-->
        <a href="index.html" class="logo">Sistema<span class="lite">Escolar</span></a>
        <!--Fim Logo-->

        <div class="nav search-row" id="top_menu">
            <!--  search form start -->
            <ul class="nav top-menu">

            </ul>
            <!--  search form end -->
        </div>

        <div class="top-nav notification-row">
            <!-- notificatoin dropdown start-->
            <ul class="nav pull-right top-menu">

                <!-- user login dropdown start-->
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                        <span class="username">Jenifer Smith</span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu extended logout">
                        <div class="log-arrow-up"></div>
                        <li class="eborder-top">
                            <a href="#"><i class="icon_profile"></i> Meu Perfil</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-sitemap"></i> Minhas Turmas</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_mail_alt"></i> Caixa de Entrada</a>
                        </li>
                        <li>
                            <a href="#"><i class="icon_chat_alt"></i> News</a>
                        </li>
                        <li>
                            <a href="login.html"><i class="icon_key_alt"></i> Sair</a>
                        </li>
                    </ul>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->

            <!--Início da Barra Lateral-->
    <aside>
        <div id="sidebar"  class="nav-collapse ">


            <!-- Início da Barra de Menu Lateral-->
            <ul class="sidebar-menu">
                <li class="active">
                    <a class="" href="index.html">
                        <i class="icon_house_alt"></i>
                        <span>Painel</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="fa fa-user"></i>
                        <span>Discente</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="cadastro_discente.jsp">Cadastro Discente</a></li>
                        <li><a class="" href="/ProgrWeb/GestaoDiscentes">Gestão Discente</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="fa fa-graduation-cap"></i>
                        <span>Docente</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">

                        <li><a class="" href="/ProgrWeb/CadastrarDocente">Cadastro Docente</a></li>
                        <li><a class="" href="/ProgrWeb/GestaoDocente">Gestão Docente</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="fa fa-sitemap"></i>
                        <span>Turmas</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="/ProgrWeb/CadastrarTurma">Cadastro Turma</a></li>
                        <li><a class="" href="/ProgrWeb/GestaoTurma">Gestão Turma</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="fa fa-folder-open"></i>
                        <span>Disciplinas</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="cadastro_disciplina.jsp">Cadastro Disciplina</a></li>
                        <li><a class="" href="gestao_disciplina.html">Gestão Disciplina</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="icon_table"></i>
                        <span>Avaliação</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="notas_frequencia.html">Notas e Frequencia</a></li>
                        <li><a class="" href="historico.html">Histórico</a></li>

                    </ul>
                </li>
                <li>
                    <a class="" href="graficos.html">
                        <i class="icon_piechart"></i>
                        <span>Gráficos</span>

                    </a>

                </li>
                <li>
                    <a class="" href="gestao_usuarios.html">
                        <i class="fa fa-users" aria-hidden="true"></i>
                        <span>Usuários</span>

                    </a>

                </li>
            </ul>
            <!-- Fim da Barra de Menu-->


        </div>
    </aside>
    <!--Fim da Barra Lateral-->
    
    <!-- Listagem das Turmas -->
    <section id="main-content">
    	<section class="wrapper"> 
		    <div class="panel-body">
		    	
				<table class="table bootstrap-datatable countries" id="alunos">
					<thead>
						<tr>
							<th>C�digo</th>
							<th>Professor</th>
							<th>S�rie</th>
							<th>Ano</th>
							<th></th>
						</tr>
					</thead>   
					
					
						<%						    
						  	List<Turma> turmas =
						      (List<Turma>) request.getAttribute("Turmas");
							Professor prof;
							
						    if (turmas != null && !turmas.isEmpty()) {
						      for (Turma t : turmas) {
						    	  prof = ProfessorDao.getProfessor(t.matric_professor);
						    %>
						    <tr>
						      <td><a href="CadastrarTurma?operacao=iniciarAlteracao&code=<%=t.codigo%>"><%=t.codigo%></a></td>
						      <td><%=prof.nome%></td>
						      <td><%=t.serie%></td>
						      <td><%=t.ano%></td>
						      <td><a href="CadastrarTurma?operacao=excluir&codigo=<%=t.codigo%>">Excluir</a></td> <!--  -->
						    </tr>
						    <%
						      }
						    }
						 %>
					
				</table>
				
				
			</div>
		</section>
	</section>



</section>
<!-- container section end -->

<!-- javascripts -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- jquery validate js -->
<script type="text/javascript" src="js/jquery.validate.min.js"></script>

<!-- custom form validation script for this page-->
<script src="js/form-validation-script.js"></script>
<!--custome script for all page-->
<script src="js/scripts.js"></script>

</body>
</html>