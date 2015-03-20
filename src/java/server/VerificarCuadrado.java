package server;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author edisonarango
 */
@WebServlet(urlPatterns = {"/VerificarCuadrado"})
public class VerificarCuadrado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerificarCuadrado</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet VerificarCuadrado at " + request.getContextPath() + "</h1>");
            String[][] nombres={{"0","1","2"},{"3","4","5"},{"6","7","8"}};
            int [][] parametros= new int [3][3];
            boolean vacios=false;
            
            principal:
            for (int i = 0; i < parametros.length; i++) {
                for (int j = 0; j < parametros[0].length; j++) {
                    String parametro = request.getParameter(nombres[i][j]);
                    if (parametro.equals("")) {
                        out.print("<center>Hay elementos vac&iacute;os</center>");
                        vacios=true;
                        break principal;
                    }
                    else{
                        parametros[i][j]=Integer.valueOf(parametro);
                    }
                }
            }
            
            if (!vacios) {
                int valorAVerificar = parametros[0][0]+parametros[0][1]+parametros[0][2];
                boolean correcto = true;
                for (int i = 0; i < 3 && correcto == true; i++) {
                    if (parametros[i][0]+parametros[i][1]+parametros[i][2]!=valorAVerificar) {
                        correcto = false;
                    }
                }
                for (int j = 0; j < 3 && correcto == true; j++) {
                    if (parametros[0][j]+parametros[1][j]+parametros[2][j]!=valorAVerificar) {
                        correcto = false;
                    }
                }
                if (parametros[0][0]+parametros[1][1]+parametros[2][2]!=valorAVerificar) {
                    correcto = false;
                }
                if (parametros[2][0]+parametros[1][1]+parametros[0][2]!=valorAVerificar) {
                    correcto = false;
                }
                if (correcto) {
                    out.print("<center>El cuadrado m&aacute;gico esta correcto</center>");
                }
                else{
                    out.print("<center>El cuadrado m&aacute;gico esta incorrecto</center>");
                }
            }
                
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
