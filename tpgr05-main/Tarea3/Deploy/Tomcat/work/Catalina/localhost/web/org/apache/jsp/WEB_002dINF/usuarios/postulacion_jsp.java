/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.15
 * Generated at: 2023-11-14 01:40:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.usuarios;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.trabajouy.model.EstadoSesion;
import servidor.DtUsuario;
import servidor.DtOferta;
import servidor.DtPostulacion;
import java.util.Set;

public final class postulacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/media/styles/infoOfertaFrontend.css", Long.valueOf(1699925636000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("servidor.DtPostulacion");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("servidor.DtUsuario");
    _jspx_imports_classes.add("com.trabajouy.model.EstadoSesion");
    _jspx_imports_classes.add("servidor.DtOferta");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Postulacion</title>\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write(".main-content {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: left;\n");
      out.write("  align-items: flex-start;\n");
      out.write("  gap: 0em;\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  min-width: 950px;/*MODIFIQUE ESTO-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-*/\n");
      out.write("  padding:  2em;\n");
      out.write("  /* Agregado para dar un poco de espacio interno */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".buttons-section {\n");
      out.write("  display: flex;\n");
      out.write("  gap: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content-section {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: flex-start;\n");
      out.write("\n");
      out.write("  flex-direction: row;\n");
      out.write("  gap: 0em;\n");
      out.write("  margin-left: 5em;;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".content-extra {\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  flex-wrap: nowrap;\n");
      out.write("  gap: 1em;\n");
      out.write(" /* max-width: 500px;*/\n");
      out.write("  padding-top: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".job-card {\n");
      out.write("  width: 90%;\n");
      out.write("  background-color: #fff;\n");
      out.write("  max-width: 900px;\n");
      out.write("\n");
      out.write("  border-radius: 10px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);\n");
      out.write("  transition: transform 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".job-card:hover {\n");
      out.write("  transform: translateY(-10px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info-oferta {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".oferta-image {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 300px;\n");
      out.write("  object-fit: cover;\n");
      out.write("  display: block;\n");
      out.write("  filter: drop-shadow(10px 10px 10px rgba(0, 0, 0, 0.3));\n");
      out.write("  filter: brightness(0.5) blur(2px);\n");
      out.write("  transition: filter 0.2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info-oferta img:hover {\n");
      out.write("  filter: brightness(1) blur(0px);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info-oferta h2 {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 10px;\n");
      out.write("  /* Distancia desde la parte superior */\n");
      out.write("  left: 10px;\n");
      out.write("  /* Distancia desde la izquierda */\n");
      out.write("  padding: 0.5em 1em;\n");
      out.write("  padding-right: 0;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 2em;\n");
      out.write("  z-index: 2;\n");
      out.write("  /* Asegura que estÃ© encima de la imagen */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info-oferta ul {\n");
      out.write("  padding: 0.5em;\n");
      out.write("  list-style: none;\n");
      out.write("  gap: 0.2em;\n");
      out.write("  display: flex;\n");
      out.write("  \n");
      out.write("  flex-direction: column;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dflex {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: space-between;\n");
      out.write("  align-items: center;\n");
      out.write("  padding: 0.5em 0;\n");
      out.write("  border: 0px;\n");
      out.write("  border-bottom: 1px;\n");
      out.write("  border-style: solid;\n");
      out.write("  border-color: grey;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".dflex h3,\n");
      out.write(".dflex p {\n");
      out.write("  width: 48%;\n");
      out.write("  /* para que los tÃ­tulos y los detalles ocupen casi el mismo espacio */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".package-section {\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".package-section,\n");
      out.write(".applicants-section {\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);\n");
      out.write("  transition: transform 0.3s;\n");
      out.write("  align-items: center;\n");
      out.write("  padding: 1em;\n");
      out.write("  min-width: 180px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".package-section:hover,\n");
      out.write(".applicants-section:hover {\n");
      out.write("  transform: translateY(-10px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".package-section img {\n");
      out.write("  margin: 1em;\n");
      out.write("  width: 60px;\n");
      out.write("  height: 60px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".applicant img {\n");
      out.write("  width: 60px;\n");
      out.write("  height: 60px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  margin: 0.2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".package-section h3,\n");
      out.write(".applicants-section h3 {\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 1em;\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".applicants-section {\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  gap: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".applicant {\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  gap: 1em;\n");
      out.write("  padding: 0.5em 0;\n");
      out.write("  color: black;\n");
      out.write("  border-bottom: 1px solid #eee;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".applicant:last-child {\n");
      out.write("  border-bottom: none;\n");
      out.write("}\n");
      out.write(".icon{\n");
      out.write("	 width: 24px;\n");
      out.write("	 height: 24px;\n");
      out.write(" } \n");
      out.write("@media (max-width: 768px) {\n");
      out.write("  .main-content {\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .left-section {\n");
      out.write("    max-width: 100%;\n");
      out.write("    /* Usa todo el ancho disponible */\n");
      out.write("    margin-left: 0;\n");
      out.write("    padding: 1em 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .content-extra {\n");
      out.write("    max-width: 100%;\n");
      out.write("    /* Usa todo el ancho disponible */\n");
      out.write("    margin-left: 0;\n");
      out.write("    padding: 1em 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .content-section {\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    gap: 1em;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .job-card {\n");
      out.write("    max-width: 100%;\n");
      out.write("    /* Usa todo el ancho disponible */\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .profile-section {\n");
      out.write("    margin-right: 0;\n");
      out.write("    padding: 1em;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("#frontend-visitante {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: baseline;\n");
      out.write("  flex-direction: row;\n");
      out.write("  align-items: flex-start;\n");
      out.write("  gap: 1em;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  padding: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".centerText h1 {\n");
      out.write("  text-align: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 150px;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  border: 2px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: #f8f8f8;\n");
      out.write("  font-size: 16px;\n");
      out.write("  resize: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu-bar {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: end;\n");
      out.write("  gap: 10px;\n");
      out.write("  margin: 5px 0 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu-button {\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #f3f4f6;\n");
      out.write("  transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu-bar button, input[type=submit] {\n");
      out.write("  padding: 10px 15px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  letter-spacing: 0.5px;\n");
      out.write("  background-color: #28666e;\n");
      out.write("  color: #ffffff;\n");
      out.write("  transition: background-color 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu-bar button:hover, input[type=submit]:hover {\n");
      out.write("  background-color: #1c4c56;\n");
      out.write("  transform: translateY(-3px);\n");
      out.write("  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".menu-button:hover {\n");
      out.write("  background-color: #e1e2e5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu-button.active {\n");
      out.write("  background-color: #28666e;\n");
      out.write("  color: #ffffff;\n");
      out.write("}\n");
      out.write(".info-oferta {\n");
      out.write("    position: relative; /* Posicionamiento relativo para la superposiciÃ³n */\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".image-container {\n");
      out.write("    position: relative; /* Contenedor de la imagen */\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".ver-postulacion-btn {\n");
      out.write("    position: absolute; /* PosiciÃ³n absoluta para la superposiciÃ³n */\n");
      out.write("    top: 100px; /* Espaciado desde la parte superior */\n");
      out.write("    left: 80%; /* Centrado horizontal */\n");
      out.write("    transform: translateX(-50%); /* Ajuste fino para centrar exactamente */\n");
      out.write("    background-color: rgba(40, 102, 110, 0.9); /* Color semi-transparente */\n");
      out.write("    color: white; /* Color de texto */\n");
      out.write("    padding: 10px 20px; /* Espaciado interno */\n");
      out.write("    border: none; /* Sin bordes */\n");
      out.write("    border-radius: 5px; /* Bordes redondeados */\n");
      out.write("    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3); /* Sombra sutil */\n");
      out.write("    cursor: pointer; /* Cursor de mano al pasar por encima */\n");
      out.write("    transition: background-color 0.3s; /* TransiciÃ³n suave del color de fondo */\n");
      out.write("    transition: font-weight 0.3s; /* TransiciÃ³n suave del color de fondo */\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ver-postulacion-btn:hover {\n");
      out.write("  background-color: #1e4d56;\n");
      out.write("  font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nombre-oferta {\n");
      out.write("    margin-top: 20px; /* Espacio entre la imagen y el tÃ­tulo */\n");
      out.write("    font-size: 1.5em; /* TamaÃ±o del tÃ­tulo */\n");
      out.write("    color: #28666e; /* Color del tÃ­tulo */\n");
      out.write("    font-weight: 600; /* Negrita para el tÃ­tulo */\n");
      out.write("    display: flex;\n");
      out.write("    gap: 0;\n");
      out.write("}\n");
      out.write(".icon-container{\n");
      out.write("	display: flex;\n");
      out.write("	flex-direction: row;\n");
      out.write("	margin-left: 3em;\n");
      out.write("	\n");
      out.write("}\n");
      out.write(".icon-container h3{\n");
      out.write("	\n");
      out.write("	margin-left: 1em;\n");
      out.write("	\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("	font-weight: 800;\n");
      out.write("}\n");
      out.write("a:link, a:visited, a:active, a:hover {\n");
      out.write("  color: whitesmoke;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".finalizar-oferta {\n");
      out.write("	max-height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".postulacionicons{\n");
      out.write("	margin-right: 1em;\n");
      out.write("}\n");
      out.write("iframe{\n");
      out.write("	padding: 1em;\n");
      out.write("	border-radius: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rank-postulantes {\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rank-postulantes input {\n");
      out.write("	 width: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/template/header.jsp", out, false);
      out.write("\n");
      out.write("    <main id=\"frontend-visitante\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/template/leftPanel.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"content-section\">\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"job-card\">\n");
      out.write("                    <div class=\"info-oferta\">\n");
      out.write("                        <img class=\"oferta-image\" src=\"/web/media/images/");
      out.print( (String)((DtOferta) request.getSession().getAttribute("info_oferta")).getUrlFoto() );
      out.write("\" alt=\"foto trabajo\">\n");
      out.write("                        <h2>");
      out.print( ((DtOferta)request.getSession().getAttribute("info_oferta")).getNombre() );
      out.write("</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"dflex postulacionicons\">\n");
      out.write("                                <div class=\"icon-container\">\n");
      out.write("                             	<img class=\"icon\" src=\"/web/media/images/id-card.png\">\n");
      out.write("                            \n");
      out.write("                                <h3>Postulante</h3>\n");
      out.write("                             </div>\n");
      out.write("                                <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getPostulante() );
      out.write("</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dflex\">\n");
      out.write("                                <div class=\"icon-container\">\n");
      out.write("                             	<img class=\"icon\" src=\"/web/media/images/cv.png\">\n");
      out.write("                            \n");
      out.write("                                <h3>CV reducido</h3>\n");
      out.write("                             </div>\n");
      out.write("                                <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getCurriculum() );
      out.write("</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dflex\">\n");
      out.write("                               <div class=\"icon-container\">\n");
      out.write("                             	<img class=\"icon\" src=\"/web/media/images/achivement.png\">\n");
      out.write("                            \n");
      out.write("                                <h3>Motivacion</h3>\n");
      out.write("                             </div>\n");
      out.write("                                    <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getDescripcion() );
      out.write("</p>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"dflex\">\n");
      out.write("                            <div class=\"icon-container\">\n");
      out.write("                             	<img class=\"icon\" src=\"/web/media/images/calendar.png\">\n");
      out.write("                            \n");
      out.write("                                <h3>Fecha postulacion</h3>\n");
      out.write("                             </div>\n");
      out.write("                                \n");
      out.write("                                <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getFechaString() );
      out.write("</p>\n");
      out.write("                            </li>\n");
      out.write("                             <li class=\"dflex\">\n");
      out.write("                            <div class=\"icon-container\">\n");
      out.write("                             	<img class=\"icon\" src=\"/web/media/images/orden.png\">\n");
      out.write("                            \n");
      out.write("                                <h3>Orden seleccionado</h3>\n");
      out.write("                             </div>\n");
      out.write("                                ");
 if (((DtPostulacion)request.getSession().getAttribute("postulacion")).getOrden() != -1) {
      out.write("\n");
      out.write("                               <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getOrden() );
      out.write("</p>\n");
      out.write("                                <p>");
      out.print( ((DtPostulacion)request.getSession().getAttribute("postulacion")).getFechaOrdenString() );
      out.write("</p>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                              ");
	String postulante = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getPostulante();
                                	String empresa = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getEmpresa();
                                	String oferta = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getOferta();
                                	int orden = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getOrden();
                                	String fecha = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getFechaString();
                                	String fechaOrden = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getFechaOrdenString();
                                	
      out.write("\n");
      out.write("                                <form action=\"generarPDF\" method=\"get\">\n");
      out.write("                                	<input type=\"hidden\" name=\"postulante\" value=\"");
      out.print( postulante );
      out.write("\">\n");
      out.write("							        <input type=\"hidden\" name=\"empresa\" value=\"");
      out.print( empresa );
      out.write("\">\n");
      out.write("							        <input type=\"hidden\" name=\"oferta\" value=\"");
      out.print( oferta );
      out.write("\">\n");
      out.write("							        <input type=\"hidden\" name=\"orden\" value=\"");
      out.print( orden );
      out.write("\">\n");
      out.write("							        <input type=\"hidden\" name=\"fecha\" value=\"");
      out.print( fecha );
      out.write("\">\n");
      out.write("							        <input type=\"hidden\" name=\"fechaOrden\" value=\"");
      out.print( fechaOrden );
      out.write("\">\n");
      out.write("							        <button type=\"submit\">Descargar PDF</button>\n");
      out.write("							    </form>\n");
      out.write("                           ");
} else { 
      out.write("\n");
      out.write("                           		<p>Pendiente</p>\n");
      out.write("                           ");
} 
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            ");
  String nombrePostulante = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getPostulante(); 
                            if(!((DtPostulacion)request.getSession().getAttribute("postulacion")).getUrlVideo().isEmpty()){ 
                                 String url = ((DtPostulacion)request.getSession().getAttribute("postulacion")).getUrlVideo();
                                 
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                               <iframe width=\"800\" height=\"600\" src=\"");
      out.print(url);
      out.write("\" title=\"");
      out.print(nombrePostulante);
      out.write("\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>\n");
      out.write("                            \n");
      out.write("                            </li>\n");
      out.write("                            ");
} 
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
