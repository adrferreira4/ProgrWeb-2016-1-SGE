<!DOCTYPE html>
<%@page import="classes.Aluno"%>
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

        <!--In�cio da Barra Lateral-->
    <aside>
        <div id="sidebar"  class="nav-collapse ">


            <!-- In�cio da Barra de Menu Lateral-->
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
                        <li><a class="" href="/ProgrWeb/GestaoDiscentes">Gest�o Discente</a></li>
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
                        <li><a class="" href="/ProgrWeb/GestaoDocente">Gest�o Docente</a></li>
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
                        <li><a class="" href="/ProgrWeb/GestaoTurma">Gest�o Turma</a></li>
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
                        <li><a class="" href="gestao_disciplina.html">Gest�o Disciplina</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;" class="">
                        <i class="icon_table"></i>
                        <span>Avalia��o</span>
                        <span class="menu-arrow arrow_carrot-right"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="notas_frequencia.html">Notas e Frequencia</a></li>
                        <li><a class="" href="historico.html">Hist�rico</a></li>

                    </ul>
                </li>
                <li>
                    <a class="" href="graficos.html">
                        <i class="icon_piechart"></i>
                        <span>Gr�ficos</span>

                    </a>

                </li>
                <li>
                    <a class="" href="gestao_usuarios.html">
                        <i class="fa fa-users" aria-hidden="true"></i>
                        <span>Usu�rios</span>

                    </a>

                </li>
            </ul>
            <!-- Fim da Barra de Menu-->


        </div>
    </aside>
    <!--Fim da Barra Lateral-->


    <!--Inicio do Conteúdo Principal-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-files-o"></i> Cadastro Discente</h3>
                    <ol class="breadcrumb">
                        <li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
                        <li><i class="fa fa-user"></i></i>Discente</li>
                        <li><i class="fa fa-files-o"></i>Cadastro Discente</li>
                    </ol>
                </div>
            </div>
            <!-- Form validations -->
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">Formulario de Cadastro Discente</header>
                        <div class="panel-body">
                            <div class="form">
                                <form class="form-validate form-horizontal" id="feedback_form" method="get" action="CadastrarDiscente">
                                	<%
                                		String operacao = (String) request.getAttribute("operacao");
                                		if (operacao == "iniciarAlteracao"){
                                			Aluno aluno = (Aluno) request.getAttribute("aluno");
                                			request.setAttribute("matricula", aluno.matricula);
                                	%>
                                		<input class="form-control" id="matricula" name="matricula" type="hidden" value=<%=aluno.matricula%> >
	                                    <div class="form-group ">
	                                        <label for="cname" class="control-label col-lg-2">Nome Completo <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <textarea class="form-control" id="cname" name="fullname" minlength="4" type="text" rows="1" cols="100" required><%=aluno.nome %></textarea> 
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="cnmae" class="control-label col-lg-2">Nome da M�e <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <textarea class="form-control " id="cnmae" name="mothername"  minlength="4" type="text" rows="1" cols="100" required ><%=aluno.nome_mae%></textarea>
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="curl" class="control-label col-lg-2">Nome do Pai </label>
	                                        <div class="col-lg-10">
	                                            <textarea class="form-control " id="curl" type="text" name="fathername" rows="1" cols="100"> <%=aluno.nome_pai%></textarea>
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="ccep" class="control-label col-lg-2">CEP <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <textarea class="form-control " id="ccep" name="cep"  minlength="4" type="text" rows="1" cols="100" required ><%=aluno.cep%></textarea>
	                                        </div>
	                                    </div>
	                                        <div class="form-group ">
	                                            <label for="cendereco" class="control-label col-lg-2">Endere�o <span class="required">*</span></label>
	                                            <div class="col-lg-10">
	                                                <textarea class="form-control" id="cendereco" name="endereco" minlength="5" type="text" rows="1" cols="100" required ><%=aluno.endereco%></textarea>
	                                            </div>
	                                        </div>
	                                    <div class="form-group ">
	                                        <label for="cdate" class="control-label col-lg-2">Data de Nascimento </label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control " id="cdate" name="dataNascimento" type="date" value=<%=aluno.data_nascimento %> required/>
	                                        </div>
	                                    </div>
	                                    <div class="form-group">
	                                        <div class="col-lg-offset-2 col-lg-10">
	                                        
	                                            <button class="btn btn-primary" type="submit" name="operacao" value="alterar" form="feedback_form">Atualizar</button>
	                                            <a href="/ProgrWeb/GestaoDiscente"><button class="btn btn-default" type="button" name="operacao" value="">Cancelar</button> </a>
	                                        </div>
	                                    </div>
	                                <%}else { %>
	                                	<div class="form-group ">
	                                        <label for="cname" class="control-label col-lg-2">Nome Completo <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control" id="cname" name="fullname" minlength="4" type="text" required />
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="cnmae" class="control-label col-lg-2">Nome da M�e <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control " id="cnmae" name="mothername"  minlength="4" type="text" required />
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="curl" class="control-label col-lg-2">Nome do Pai </label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control " id="curl" type="text" name="fathername" />
	                                        </div>
	                                    </div>
	                                    <div class="form-group ">
	                                        <label for="ccep" class="control-label col-lg-2">CEP <span class="required">*</span></label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control " id="ccep" name="cep"  minlength="4" type="text" required />
	                                        </div>
	                                    </div>
	                                        <div class="form-group ">
	                                            <label for="cendereco" class="control-label col-lg-2">Endere�o <span class="required">*</span></label>
	                                            <div class="col-lg-10">
	                                                <input class="form-control" id="cendereco" name="endereco" minlength="5" type="text" required />
	                                            </div>
	                                        </div>
	                                    <div class="form-group ">
	                                        <label for="cdate" class="control-label col-lg-2">Data de Nascimento </label>
	                                        <div class="col-lg-10">
	                                            <input class="form-control " id="cdate" name="dataNascimento" type="date" required/>
	                                        </div>
	                                    </div>
	                                    <div class="form-group">
	                                        <div class="col-lg-offset-2 col-lg-10">
	                                        
	                                            <button class="btn btn-primary" type="submit" name="operacao" value="incluir" form="feedback_form">Salvar</button>
	                                            <a href="/ProgrWeb/GestaoDiscente"><button class="btn btn-default" type="button" name="operacao" value="">Cancelar</button></a> 
	                                        </div>
	                                    </div>
	                                <%} %>
                                </form>
                            </div>

                        </div>
                    </section>
                </div>
            </div>
            <!-- page end-->
        </section>
    </section>
    <!--main content end-->
</section>
<!--Fim do Conteúdo Principal-->

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