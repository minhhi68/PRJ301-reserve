package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sample.dao.OrderDAO;
import java.util.ArrayList;
import sample.dto.Order;

public final class personalPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header_loginedUser.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"mycss.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String name = (String) session.getAttribute("name");
            if (name == null) {

        
      out.write("\n");
      out.write("\n");
      out.write("        <p><font color ='red'>You must login to view personal page</font></p>\n");
      out.write("        <p></p>\n");
      out.write("        ");
} else {
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"mycss.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"\">change profile</a></li>\n");
      out.write("                <li><a href=\"\">completed order</a></li>\n");
      out.write("                <li><a href=\"\">canceled orders</a></li>\n");
      out.write("                <li><a href=\"\">processing orders</a></li>\n");
      out.write("                <li>from<input type=\"date\" name=\"from\">to <input type=\"date\" name=\"to\">\n");
      out.write("                    <input type=\"submit\" value=\"search\">\n");
      out.write("                </li>                \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <h3>Welcome ");
      out.print( name);
      out.write(" come back </h3>\n");
      out.write("            <h3><a href=\"mainController?action=logout\">Log out</a></h3>\n");
      out.write("        </section>\n");
      out.write("        <section><!--load all orders of the user at here-->\n");
      out.write("            ");

                ArrayList<Order> list=OrderDAO.getOrders(email);
                String[] status = {"", "processing", "completed", "canceled"};
                if (list != null && !list.isEmpty()) {
                             for (Order ord : list) {
      out.write("\n");
      out.write("            <table class=\"order\">\n");
      out.write("                <tr><td>Order ID</td><td>Order Date</td><td>Ship Date</td><td>Order's status</td><td>action</td></tr>\n");
      out.write("                <tr><td>");
      out.print( ord.getOrderID());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ord.getOrderDate());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ord.getShipDate());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( status[ord.getStatus()]);
      out.write("\n");
      out.write("                        <br/>");
 if (ord.getStatus() == 1) 
      out.write("<a href=\"#\">cancel order</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td><a href=\"orderDetail.jsp?orderid=");
      out.print( ord.getOrderID() );
      out.write("\">detail</a> </td></tr>\n");
      out.write("            </table>\n");
      out.write("            ");
    }
              }

            else
      
      out.write("\n");
      out.write("      <p>You do not have any order</p>\n");
      out.write("\n");
      out.write("                                      \n");
      out.write("                                  \n");
      out.write("                     </section>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
