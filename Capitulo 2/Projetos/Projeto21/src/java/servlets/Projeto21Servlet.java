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
@WebServlet(name = "Projeto21Servlet", urlPatterns = {"/projeto21Servlet"})
public class Projeto21Servlet extends HttpServlet {

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
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String CPF = request.getParameter("cpf");
        String dataNascimento = request.getParameter( "dataNasc" );
        String sexo = request.getParameter( "sexo" );
        String email = request.getParameter( "email" );
        String logradouro = request.getParameter( "logradouro" );
        String numero = request.getParameter( "numero" );
        String complemento = request.getParameter( "complemento" );
        String cidade = request.getParameter( "cidade" );
        String estado = request.getParameter( "estado" );
        String cep = request.getParameter( "cep" );
        String tFilhos = request.getParameter( "tFilhos" );
        String observacoes = request.getParameter( "observacoes" );
        
        System.out.println( "Dados do Cliente:" );
        System.out.println( "Nome: " + nome );
        System.out.println( "Sobrenome: " + sobrenome );
        System.out.println( "CPF: " + CPF );
        System.out.println( "Data de Nascimento: " + dataNascimento );
        
        if(sexo.equals("M")){
            System.out.println( "Sexo: Masculino" );
        } else {
            System.out.println( "Sexo: Feminino" );
        }
        
        System.out.println( "E-mail: " + email );
        System.out.println( "Logradouro: " + logradouro );
        System.out.println( "Numero: " + numero );
        System.out.println( "Complemento: " + complemento );
        System.out.println( "Cidade: " + cidade );
        System.out.println( "Estado: " + estado );
        System.out.println( "CEP: " + cep );
        
        if(tFilhos.equals("S")){
            System.out.println( "Possui Filhos" );
        } else {
            System.out.println( "Nao Possui Filhos" );
        }
        
        System.out.println( "Observacoes: " + observacoes );
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
