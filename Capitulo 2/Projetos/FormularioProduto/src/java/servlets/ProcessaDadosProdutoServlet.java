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
@WebServlet(name = "ProcessaDadosProdutoServlet", urlPatterns = {"/processaDadosProdutoServlet"})
public class ProcessaDadosProdutoServlet extends HttpServlet {

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
        
        String codBarras = request.getParameter("codBarras");
        String descricao = request.getParameter("descricao");
        String unidadeMedida = request.getParameter("unidadeMedida");
        String qtdEmbalagem = request.getParameter("qtdEmbalagem");
        String fabricante = request.getParameter("fabricante");
        
        System.out.println("Dados do Produto:");
        System.out.println("Codigo de Barras: " + codBarras);
        System.out.println("Descricao: " + descricao);
        
        if(unidadeMedida.equals("K")){
            System.out.println("Unidade de Medida: Kg");
        } else {
            System.out.println("Unidade de Medida: Unidade");
        }
        
        System.out.println("Quantidade por Embalagem: " + qtdEmbalagem);
        System.out.println("Fabricante: " + fabricante);
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
