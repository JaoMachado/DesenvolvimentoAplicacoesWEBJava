<%-- 
    Document   : exibeDados
    Created on : 21 de ago. de 2025, 20:05:28
    Author     : João Pedro Machado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dados do DVD</title>
        
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
        <h1>Dados do DVD</h1>
        
        <table class="tabela">
            <tr>
                <td>Número: </td>
                <td>${requestScope.dvdRegistrado.numero}</td>
            </tr>
            <tr>
                <td>Título: </td>
                <td>${requestScope.dvdRegistrado.titulo}</td>
            </tr>
            <tr>
                <td>Ator/Atriz Principal: </td>
                <td>${requestScope.dvdRegistrado.aPrincipal}</td>
            </tr>
            <tr>
                <td>Ator/Atriz Coadjuvante: </td>
                <td>${requestScope.dvdRegistrado.aCoadjuvante}</td>
            </tr>
            <tr>
                <td>Diretor/Diretora: </td>
                <td>${requestScope.dvdRegistrado.diretor}</td>
            </tr>
            <tr>
                <td>Ano de Lançamento: </td>
                <td>${requestScope.dvdRegistrado.anoLancamento}</td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="index.html">Voltar</a>
                </td>
            </tr>
        </table>
    </body>
</html>
