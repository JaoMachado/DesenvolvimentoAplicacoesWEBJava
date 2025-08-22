<%-- 
    Document   : exibeDados
    Created on : 21 de ago. de 2025, 19:45:44
    Author     : João Pedro Machado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente Registrado</title>
        
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
        <table  class="tabela">
            <tr>
                <td>Nome:</td>
                <td>${requestScope.clienteRegistrado.nome}</td>
            </tr>
            <tr>
                <td>Sobrenome:</td>
                <td>${requestScope.clienteRegistrado.sobrenome}</td>
            </tr>
            <tr>
                <td>CPF:</td>
                <td>${requestScope.clienteRegistrado.cpf}</td>
            </tr>
            <tr>
                <td>Data de Nascimento:</td>
                <td>${requestScope.clienteRegistrado.dataNascimento}</td>
            </tr>
            <tr>
                <td>Sexo:</td>
                <td>${requestScope.clienteRegistrado.sexo}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${requestScope.clienteRegistrado.email}</td>
            </tr>
            <tr>
                <td>Logradouro:</td>
                <td>${requestScope.clienteRegistrado.logradouro}</td>
            </tr>
            <tr>
                <td>Número:</td>
                <td>${requestScope.clienteRegistrado.numero}</td>
            </tr>
            <tr>
                <td>Complemento:</td>
                <td>${requestScope.clienteRegistrado.complemento}</td>
            </tr>
            <tr>
                <td>Cidade:</td>
                <td>${requestScope.clienteRegistrado.cidade}</td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td>${requestScope.clienteRegistrado.estado}</td>
            </tr>
            <tr>
                <td>CEP:</td>
                <td>${requestScope.clienteRegistrado.cep}</td>
            </tr>
            <tr>
                <td>Tem Filhos:</td>
                <td>${requestScope.clienteRegistrado.temFilhos}</td>
            </tr>
            <tr>
                <td>Observações:</td>
                <td>${requestScope.clienteRegistrado.observacoes}</td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="index.html">Voltar</a>
                </td>
            </tr>
        </table>
    </body>
    
</html>
