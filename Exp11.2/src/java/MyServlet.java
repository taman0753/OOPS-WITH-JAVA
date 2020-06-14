import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

	public class MyServlet extends HttpServlet{
   public void doGet(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException{
  PrintWriter pw = response.getWriter();
  Date today = new Date();
  pw.println("<h1>Date is</h1>");
  pw.println(today);
  }
}