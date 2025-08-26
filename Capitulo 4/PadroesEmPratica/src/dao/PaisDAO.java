/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bv3032477
 */
public class PaisDAO extends DAO<Pais> {
    
    public PaisDAO() throws SQLException{
    }

    @Override
    public void salvar(Pais obj) throws SQLException{
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            INSERT INTO pais(nome, sigla) VALUES (?, ?);
                                                          """);
            
        // Setando os parametros a inserir no banco
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getSigla());
            
        // Agora sim, realizando a operação
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void atualizar(Pais obj) throws SQLException{
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            UPDATE pais
                                                            SET 
                                                                nome = ?, 
                                                                sigla = ?
                                                            WHERE
                                                            id = ?;
                                                          """);
            
        // Setando os parametros a atualizar no banco
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getSigla());
        stmt.setInt(3, obj.getId());
            
        // Agora sim, realizando a operação
        stmt.executeUpdate();
        stmt.close();
    }
    
    @Override
    public void excluir(Pais obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            DELETE FROM pais WHERE id = ?;
                                                          """);
            
        // Setando o parametro a excluir no banco
        stmt.setInt(1, obj.getId());
            
        // Agora sim, realizando a operação
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public Pais obterPorId(int id) throws SQLException{
        Pais p = null;
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM pais WHERE id = ?;
                                                          """);
            
        // Setando o parametro a obter no banco
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
           p = new Pais();
           p.setId(rs.getInt("id"));
           p.setNome(rs.getString("nome"));
           p.setSigla(rs.getString("sigla"));
        }
            
        rs.close();
        stmt.close();
        
        return p;
    }

    @Override
    public List<Pais> obterTodos() throws SQLException{
        List<Pais> paises = new ArrayList<>();
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM pais;
                                                          """);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
           Pais p = new Pais();
           p.setId(rs.getInt("id"));
           p.setNome(rs.getString("nome"));
           p.setSigla(rs.getString("sigla"));
           paises.add(p);
        }
            
        rs.close();
        stmt.close();
        
        return paises;
    }

    
    
}
