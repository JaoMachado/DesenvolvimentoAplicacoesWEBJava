/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.ResolveResult;

/**
 *
 * @author João Pedro Machado
 */
public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO() throws SQLException {
        super();
    }
    
    @Override
    public void salvar(Produto obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            INSERT INTO produto(descricao, qtd_estoque) VALUES (?, ?);
                                                          """);
        
        stmt.setString(1, obj.getDescricao());
        stmt.setInt(2, obj.getQtd_estoque());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void atualizar(Produto obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            UPDATE produto
                                                            SET
                                                                descricao = ?,
                                                                qtd_estoque = ?
                                                            WHERE
                                                                id = ?;
                                                          """);
        
        stmt.setString(1, obj.getDescricao());
        stmt.setInt(2, obj.getQtd_estoque());
        stmt.setInt(3, obj.getId());
        
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void excluir(Produto obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            DELETE FROM produto WHERE id = ?;
                                                          """);
        stmt.setInt(1, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public Produto obterPorId(int id) throws SQLException {
        Produto p = null;
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM produto WHERE id = ?;
                                                          """);
        
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
            p = new Produto();
            p.setDescricao(rs.getString("descricao"));
            p.setId(rs.getInt("id"));
            p.setQtd_estoque(rs.getInt("qtd_estoque"));
        }
        
        rs.close();
        stmt.close();
        
        return p;
    }

    @Override
    public List<Produto> obterTodos() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM produto;
                                                          """);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Produto p = new Produto();
            p.setDescricao(rs.getString("descricao"));
            p.setId(rs.getInt("id"));
            p.setQtd_estoque(rs.getInt("qtd_estoque"));
            produtos.add(p);
        }
        
        rs.close();
        stmt.close();
        
        return produtos;
    }
    
}
