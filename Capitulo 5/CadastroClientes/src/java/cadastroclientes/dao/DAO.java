/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes.dao;

import cadastroclientes.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bv3032477
 */
public abstract class DAO<Tipo> {
    // Criando a conexão
    protected Connection conexao;
    
    public DAO() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }
    
    public abstract void salvar(Tipo obj) throws SQLException;
    public abstract void atualizar(Tipo obj) throws SQLException;
    public abstract void excluir(Tipo obj) throws SQLException;
    public abstract List<Tipo> listarTodos() throws SQLException;
    public abstract Tipo obterPorId(int id) throws SQLException;
    
    public Connection getConnection() {
        return conexao;
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }
}
