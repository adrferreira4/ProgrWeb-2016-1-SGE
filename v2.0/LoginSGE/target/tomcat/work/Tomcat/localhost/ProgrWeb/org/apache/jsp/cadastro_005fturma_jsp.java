/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-19 21:42:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.TurmaDao;
import classes.Turma;
import dao.ProfessorDao;
import classes.Professor;
import java.util.List;

public final class cadastro_005fturma_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">\r\n");
      out.write("    <meta name=\"author\" content=\"GeeksLabs\">\r\n");
      out.write("    <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>SGE</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- bootstrap theme -->\r\n");
      out.write("    <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <!-- font icon -->\r\n");
      out.write("    <link href=\"css/elegant-icons-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- full calendar css-->\r\n");
      out.write("    <link href=\"assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- easy pie chart-->\r\n");
      out.write("    <link href=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("    <!-- owl carousel -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fullcalendar.css\">\r\n");
      out.write("    <link href=\"css/widgets.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/xcharts.min.css\" rel=\" stylesheet\">\r\n");
      out.write("    <link href=\"css/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <script src=\"js/lte-ie7.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- container section start -->\r\n");
      out.write("<section id=\"container\" class=\"\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <header class=\"header dark-bg\">\r\n");
      out.write("        <div class=\"toggle-nav\">\r\n");
      out.write("            <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--CriaÃ§Ã£o do Logo-->\r\n");
      out.write("        <a href=\"index.html\" class=\"logo\">Sistema<span class=\"lite\">Escolar</span></a>\r\n");
      out.write("        <!--Fim Logo-->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav search-row\" id=\"top_menu\">\r\n");
      out.write("            <!--  search form start -->\r\n");
      out.write("            <ul class=\"nav top-menu\">\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!--  search form end -->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"top-nav notification-row\">\r\n");
      out.write("            <!-- notificatoin dropdown start-->\r\n");
      out.write("            <ul class=\"nav pull-right top-menu\">\r\n");
      out.write("\r\n");
      out.write("                <!-- user login dropdown start-->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                            <span class=\"profile-ava\">\r\n");
      out.write("                                <img alt=\"\" src=\"img/avatar1_small.jpg\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                        <span class=\"username\">Jenifer Smith</span>\r\n");
      out.write("                        <b class=\"caret\"></b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                        <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                        <li class=\"eborder-top\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_profile\"></i> Meu Perfil</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-sitemap\"></i> Minhas Turmas</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_mail_alt\"></i> Caixa de Entrada</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"icon_chat_alt\"></i> News</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"login.html\"><i class=\"icon_key_alt\"></i> Sair</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- user login dropdown end -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- notificatoin dropdown end-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!--header end-->\r\n");
      out.write("\r\n");
      out.write("     <!--Início da Barra Lateral-->\r\n");
      out.write("    <aside>\r\n");
      out.write("        <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Início da Barra de Menu Lateral-->\r\n");
      out.write("            <ul class=\"sidebar-menu\">\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <a class=\"\" href=\"index.html\">\r\n");
      out.write("                        <i class=\"icon_house_alt\"></i>\r\n");
      out.write("                        <span>Painel</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-user\"></i>\r\n");
      out.write("                        <span>Discente</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"cadastro_discente.jsp\">Cadastro Discente</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"gestao_discente.html\">Gestão Discente</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-graduation-cap\"></i>\r\n");
      out.write("                        <span>Docente</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("\r\n");
      out.write("                        <li><a class=\"\" href=\"cadastro_docente.jsp\">Cadastro Docente</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"gestao_docente.html\">Gestão Docente</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-sitemap\"></i>\r\n");
      out.write("                        <span>Turmas</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/CadastrarTurma\">Cadastro Turma</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"/ProgrWeb/GestaoTurma\">Gestão Turma</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"fa fa-folder-open\"></i>\r\n");
      out.write("                        <span>Disciplinas</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"cadastro_disciplina.jsp\">Cadastro Disciplina</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"gestao_disciplina.html\">Gestão Disciplina</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"sub-menu\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"\">\r\n");
      out.write("                        <i class=\"icon_table\"></i>\r\n");
      out.write("                        <span>Avaliação</span>\r\n");
      out.write("                        <span class=\"menu-arrow arrow_carrot-right\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"sub\">\r\n");
      out.write("                        <li><a class=\"\" href=\"notas_frequencia.html\">Notas e Frequencia</a></li>\r\n");
      out.write("                        <li><a class=\"\" href=\"historico.html\">Histórico</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"\" href=\"graficos.html\">\r\n");
      out.write("                        <i class=\"icon_piechart\"></i>\r\n");
      out.write("                        <span>Gráficos</span>\r\n");
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"\" href=\"gestao_usuarios.html\">\r\n");
      out.write("                        <i class=\"fa fa-users\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <span>Usuários</span>\r\n");
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Fim da Barra de Menu-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    <!--Fim da Barra Lateral-->\r\n");
      out.write("\r\n");
      out.write("<!--Inicio do ConteÃÂºdo Principal-->\r\n");
      out.write("    <section id=\"main-content\">\r\n");
      out.write("        <section class=\"wrapper\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h3 class=\"page-header\"><i class=\"fa fa-files-o\"></i> Cadastro Turma</h3>\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li><i class=\"fa fa-home\"></i><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                        <li><i class=\"fa fa-user\"></i></i>Turma</li>\r\n");
      out.write("                        <li><i class=\"fa fa-files-o\"></i>Cadastro Turma</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Form validations -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <section class=\"panel\">\r\n");
      out.write("                        <header class=\"panel-heading\">Formulario de Cadastro Turma</header>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div class=\"form\">\r\n");
      out.write("                                <form class=\"form-validate form-horizontal\" id=\"feedback_form\" method=\"get\" action=\"CadastrarTurma\">\r\n");
      out.write("                                ");

                               		String operacao = (String) request.getAttribute("operacao");
                               		if (operacao == "iniciarAlteracao"){
                               			Turma t = (Turma) request.getAttribute("turma");
                               			request.setAttribute("codigo", t.codigo);
                               	
      out.write("\r\n");
      out.write("                               \t\t<input class=\"form-control\" id=\"ccod\" name=\"code\" type=\"hidden\" value=");
      out.print(t.codigo);
      out.write(" >\r\n");
      out.write("                               \t\t\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cteacher\" class=\"control-label col-lg-2\">Matrícula Professor <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <!-- <input class=\"form-control \" id=\"cteacher\" name=\"teacherID\"  minlength=\"4\" type=\"text\" required /> -->\r\n");
      out.write("                                            <select class=\"form-control\" id=\"cteacher\" name=\"teacherID\" >\r\n");
      out.write("                                            ");

                                            	List<Professor> ps = ProfessorDao.listar();
                                        		
                                        		for(Professor prof : ps){
                                        			if(prof.matricula == t.matric_professor){
      out.write("\r\n");
      out.write("                                        \t\t\t\t<option value=");
      out.print(prof.matricula);
      out.write(" selected>");
      out.print(prof.nome );
      out.write("</option>\r\n");
      out.write("                                        \t\t\t");
}else {
      out.write("\r\n");
      out.write("                                        \t\t\t\t<option value=");
      out.print(prof.matricula);
      out.write(' ');
      out.write('>');
      out.print(prof.nome );
      out.write("</option>\r\n");
      out.write("                                        \t\t");
} } 
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cgrade\" class=\"control-label col-lg-2\">Série <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <input class=\"form-control \" id=\"cgrade\" type=\"number\" name=\"grade\" value=");
      out.print(t.serie );
      out.write(" required/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cyear\" class=\"control-label col-lg-2\">Ano <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <input class=\"form-control \" id=\"cyear\" name=\"year\"  minlength=\"4\" type=\"number\" value=");
      out.print(t.ano);
      out.write(" required />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-lg-offset-2 col-lg-10\">\r\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"submit\" name=\"operacao\" value=\"alterar\" form=\"feedback_form\">Atualizar</button>\r\n");
      out.write("                                            <a href=\"/ProgrWeb/GestaoTurma\" ><button class=\"btn btn-default\" type=\"button\">Cancelar</button> </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                               \t");
}else { 
      out.write("\r\n");
      out.write("                                   \r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cteacher\" class=\"control-label col-lg-2\">Matrícula Professor <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <!-- <input class=\"form-control \" id=\"cteacher\" name=\"teacherID\"  minlength=\"4\" type=\"text\" required /> -->\r\n");
      out.write("                                            <select class=\"form-control\" id=\"cteacher\" name=\"teacherID\" >\r\n");
      out.write("                                            ");

                                            	List<Professor> ps = ProfessorDao.listar();
                                        		
                                        		for(Professor prof : ps){
      out.write("\r\n");
      out.write("                                        \t\t\t<option value=");
      out.print(prof.matricula);
      out.write('>');
      out.print(prof.nome );
      out.write("</option>\r\n");
      out.write("                                        \t\t");
 } 
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cgrade\" class=\"control-label col-lg-2\">Série <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <input class=\"form-control \" id=\"cgrade\" type=\"number\" name=\"grade\" required/>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <label for=\"cyear\" class=\"control-label col-lg-2\">Ano <span class=\"required\">*</span></label>\r\n");
      out.write("                                        <div class=\"col-lg-10\">\r\n");
      out.write("                                            <input class=\"form-control \" id=\"cyear\" name=\"year\"  minlength=\"4\" type=\"number\" required />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <div class=\"col-lg-offset-2 col-lg-10\">\r\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"submit\" name=\"operacao\" value=\"incluir\" form=\"feedback_form\">Salvar</button>\r\n");
      out.write("                                            <a href=\"/ProgrWeb/GestaoTurma\" ><button class=\"btn btn-default\" type=\"button\">Cancelar</button> </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");
} 
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- page end-->\r\n");
      out.write("        </section>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--main content end-->\r\n");
      out.write("</section>\r\n");
      out.write("<!--Fim do ConteÃÂºdo Principal-->\r\n");
      out.write("</section>\r\n");
      out.write("<!-- container section end -->\r\n");
      out.write("\r\n");
      out.write("<!-- javascripts -->\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- nice scroll -->\r\n");
      out.write("<script src=\"js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- jquery validate js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- custom form validation script for this page-->\r\n");
      out.write("<script src=\"js/form-validation-script.js\"></script>\r\n");
      out.write("<!--custome script for all page-->\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
