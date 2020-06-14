/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Master
 */
public class NewServlet extends HttpServlet {
   protected void processRequest(HttpServletRequest req, HttpServletResponse res)throws IOException{
   {
        PrintWriter obj = res.getWriter();
        String values[] = req.getParameterValues("num1");
        int addition = 0;
        for(int i =0;i<values.length;i++){
        addition = addition + Integer.parseInt(values[i]);
        }
   obj.println("sum"+ addition);
   obj.println("organization name");
   ServletContext ctx= getServletContext();
   String str = ctx.getInitParameter("name");
    obj.println(str);
     obj.println("Author name:");
    String str1 = ctx.getInitParameter("author_name");
      obj.println(str1);
}}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
