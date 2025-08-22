<%-- 
    Document   : exibeDadosForm
    Created on : 22 de ago. de 2025, 09:13:30
    Author     : João Pedro Machado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulário</title>
        
        <style>
            .tabela {
                border-collapse: collapse;
                
            }
  
            td{
                padding: 8px;
                border: 1px solid #ddd;
            }
            
            tr:hover {
                background-color: #f9f9f9;
            }
        </style>
        
    </head>
    <body>
        <h1>Dados</h1>
        
        <table class="tabela">
            <tr>
                <td>Nome: </td>
                <td>${param.nome}</td>
            </tr>
            <tr>
                <td>Idade: </td>
                <td>${param.idade}</td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="index.html">Voltar</a>
                </td>
            </tr>
        </table>
    </body>
</html>
