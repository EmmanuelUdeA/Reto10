/*
 Codigo realizado por Emmanuel Bustamante & Alejandro Becerra
 */
package co.edu.udea.aplicacionweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Talia Palacio Mira
 */
@WebServlet("/hola")
public class recursos extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        
      throws ServletException, IOException 
    try{
    String numeros = request.getParameter("numero");
    if (numeros == null || numeros.isEmpty()) { try(PrintWriter out = response.getWriter())
    {System.out.println("Imprimiendo HTML"); 
       out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
          out.println(" <title>Start Page</title>");
           out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
           out.println(" </head>");
             out.println("<body>");
             out.println("<h1>error, Valor invalido!</h1>");
               out.println(" </body>");
                 out.println("</html>");
                 }
        }   else{
    
    int numero = Integer.valueOf(request.getParameter("numero"));
    if(numero<0){ try(PrintWriter out = response.getWriter())
    {System.out.println("Imprimiendo HTML"); 
       out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
          out.println(" <title>Start Page</title>");
           out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
           out.println(" </head>");
             out.println("<body>");
             out.println("<h1>error, el numero no puede ser negativo!</h1>");
               out.println(" </body>");
                 out.println("</html>");
                 }
            }   
    }
        
        Integer numero = Integer.valueOf(request.getParameter("numero"));
        Integer resultado = 0;
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet recursos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet recursos at " + request.getContextPath() + "</h1>");
            System.out.println("<p>El numero " + numero + "tiene de factorial:  "+resultado);
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
