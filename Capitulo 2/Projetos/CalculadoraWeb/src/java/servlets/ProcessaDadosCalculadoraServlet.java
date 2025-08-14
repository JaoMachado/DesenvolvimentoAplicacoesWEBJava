/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author João Pedro Machado
 */
@WebServlet(name = "ProcessaDadosCalculadoraServlet", urlPatterns = {"/processaDadosCalculadoraServlet"})
public class ProcessaDadosCalculadoraServlet extends HttpServlet {

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
        
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacao = request.getParameter("operacao");
        
        int numero1Int = Integer.parseInt(numero1);
        int numero2Int = Integer.parseInt(numero2);
        
        if(operacao.equals("A")){
            System.out.println("Resultado da Adicao: " + (numero1Int+numero2Int));
        } else if(operacao.equals("S")){
            System.out.println("Resultado da Subtracao: " + (numero1Int-numero2Int));
        } else if(operacao.equals("M")){
            System.out.println("Resultado da Multiplicacao: " + (numero1Int*numero2Int));
        } else {
            System.out.println("Resultado da Divisao: " + (numero1Int/numero2Int));
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
