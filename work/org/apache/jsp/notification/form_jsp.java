/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2012-08-14 06:50:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.notification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/taglibs.jsp", Long.valueOf(1340954554000L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Admin Console</title>\r\n");
      out.write("\t<meta name=\"menu\" content=\"notification\" />    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1>Send Notifications</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"margin:20px 0px;\">\r\n");
      out.write("<form action=\"./notification.do?action=send\" method=\"post\" style=\"margin: 0px;\">\r\n");
      out.write("<table width=\"600\" cellpadding=\"4\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td width=\"20%\">To:</td>\r\n");
      out.write("\t<td width=\"80%\">\r\n");
      out.write("\t\t<input type=\"radio\" name=\"broadcast\" value=\"Y\" checked=\"checked\" />  All (Broadcast) \r\n");
      out.write("        <input type=\"radio\" name=\"broadcast\" value=\"N\" /> Single Device \r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr id=\"trUsername\" style=\"display:none;\">\r\n");
      out.write("\t<td>Username:</td>\r\n");
      out.write("\t<td><input type=\"text\" id=\"username\" name=\"username\" value=\"\" style=\"width:380px;\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Title:</td>\r\n");
      out.write("\t<td><input type=\"text\" id=\"title\" name=\"title\" value=\"Dokdo Island\" style=\"width:380px;\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>Message:</td>\r\n");
      out.write("\t<td><textarea id=\"message\" name=\"message\" style=\"width:380px; height:80px;\" >Dokdo is a Korean island, the far east of the Korean territory. No doubt! No question! Don't mention it any more!</textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>URI:</td>\r\n");
      out.write("\t<td><input type=\"text\" id=\"uri\" name=\"uri\" value=\"\" style=\"width:380px;\" />\r\n");
      out.write("\t    <br/><span style=\"font-size:0.8em\">ex) http://www.dokdocorea.com, geo:37.24,131.86, tel:111-222-3333</span>\r\n");
      out.write("\t</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t<td>&nbsp;</td>\r\n");
      out.write("\t<td><input type=\"submit\" value=\"Submit\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table> \r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("//<![CDATA[\r\n");
      out.write(" \r\n");
      out.write("$(function() {\r\n");
      out.write("\t$('input[name=broadcast]').click(function() {\r\n");
      out.write("\t\tif ($('input[name=broadcast]')[0].checked) {\r\n");
      out.write("\t\t\t$('#trUsername').hide();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#trUsername').show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tif ($('input[name=broadcast]')[0].checked) {\r\n");
      out.write("\t\t$('#trUsername').hide();\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t$('#trUsername').show();\r\n");
      out.write("\t}\t\r\n");
      out.write("});\r\n");
      out.write(" \r\n");
      out.write("//]]>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
