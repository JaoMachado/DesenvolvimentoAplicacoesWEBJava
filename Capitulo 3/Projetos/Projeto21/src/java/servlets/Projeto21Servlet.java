/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import entidades.Cliente;
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
        request.setCharacterEncoding( "UTF-8" );
        
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String CPF = request.getParameter("cpf");
        String dataNascimento = request.getParameter( "dataNasc" );
        String sexo = request.getParameter( "sexo" );
        String email = request.getParameter( "email" );
        String logradouro = request.getParameter( "logradouro" );
        String complemento = request.getParameter( "complemento" );
        String cidade = request.getParameter( "cidade" );
        String estado = request.getParameter( "estado" );
        String cep = request.getParameter( "cep" );
        String tFilhos = request.getParameter( "tFilhos" );
        String observacoes = request.getParameter( "observacoes" );
        int numero = 0;
        
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        } catch (NumberFormatException e) {
            System.out.println( "Erro ao converter o número." );
        }
        
        Cliente cliente = new Cliente();
        cliente.setCep(cep);
        cliente.setCidade(cidade);
        cliente.setComplemento(complemento);
        cliente.setCpf(CPF);
        cliente.setDataNascimento(dataNascimento);
        cliente.setEmail(email);
        cliente.setEstado(estado);
        cliente.setLogradouro(logradouro);
        cliente.setNome(nome);
        cliente.setNumero(numero);
        cliente.setObservacoes(observacoes);
        cliente.setSexo(sexo);
        cliente.setSobrenome(sobrenome);
        cliente.setTemFilhos(tFilhos);
        
        request.setAttribute( "clienteRegistrado", cliente );
        
        RequestDispatcher disp =request.getRequestDispatcher("exibeDados.jsp");
        disp.forward( request, response );
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
