/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import entidades.DVD;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author João Pedro Machado
 */
@WebServlet(name = "ProcessaDadosDVDServlet", urlPatterns = {"/processaDadosDVDServlet"})
public class ProcessaDadosDVDServlet extends HttpServlet {

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
        
        request.setCharacterEncoding("UTF-8");
        
        int numero = 0;
        String titulo = request.getParameter("titulo");
        String aPrincipal = request.getParameter("aPrincipal");
        String aCoadjuvante = request.getParameter("aCoadjuvante");
        String diretor = request.getParameter("diretor");
        int anoLancamento = 0;
        
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException e) {
            System.out.println("Erro na conversao do numero!!");
        }
        
        try {
            anoLancamento = Integer.parseInt(request.getParameter("anoLancamento"));
        } catch (NumberFormatException e) {
            System.out.println("Erro na conversao do ano de lancamento!!");
        }
        
        DVD dvd = new DVD();
        dvd.setAnoLancamento(anoLancamento);
        dvd.setDiretor(diretor);
        dvd.setNumero(numero);
        dvd.setTitulo(titulo);
        dvd.setaCoadjuvante(aCoadjuvante);
        dvd.setaPrincipal(aPrincipal);
        
        request.setAttribute("dvdRegistrado", dvd);
        RequestDispatcher disp = request.getRequestDispatcher("exibeDados.jsp");
        disp.forward(request, response);
        
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
