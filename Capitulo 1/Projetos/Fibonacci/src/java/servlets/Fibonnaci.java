/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author João Pedro Machado
 */
@WebServlet(name = "Fibonacci", urlPatterns = { "/fibonacci" })
public class Fibonnaci extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("fibonacci(5): " + fibonacci(5));
        System.out.println("fibonacci(7): " + fibonacci(7));
        System.out.println("fibonacci(12): " + fibonacci(12));
        System.out.println("fibonacci(22): " + fibonacci(22));
        System.out.println("fibonacci(25): " + fibonacci(25));
    }
    
    protected int fibonacci(int n){
        if( n < 2 ){
            return 1;
        }
        
        int a = 1;
        int b = 1;
        int c = 0;
        
        for(int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
    
}
