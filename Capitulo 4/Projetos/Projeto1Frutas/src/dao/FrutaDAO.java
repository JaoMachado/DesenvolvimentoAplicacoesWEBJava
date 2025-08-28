/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Fruta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Machado
 */
public class FrutaDAO extends DAO<Fruta>{

    public FrutaDAO() throws SQLException{
        super();
    }
//    
    @Override
    public void salvar(Fruta obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            INSERT INTO fruta(nome, cor_predominante) VALUES (?, ?);
                                                          """);
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getCor_predominante());
        
        stmt.executeUpdate();
        stmt.close();
        
    }

    @Override
    public void atualizar(Fruta obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            UPDATE fruta
                                                            SET 
                                                                nome = ?,
                                                                cor_predominante = ?
                                                            WHERE 
                                                                id = ?;
                                                          """);
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getCor_predominante());
        stmt.setInt(3, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void excluir(Fruta obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            DELETE FROM fruta WHERE id = ?;
                                                          """);

        stmt.setInt(1, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public Fruta obterPorId(int id) throws SQLException {
        Fruta fruta = null;
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM fruta WHERE id = ?;
                                                          """);
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
           fruta = new Fruta();
           fruta.setId(rs.getInt("id"));
           fruta.setNome(rs.getString("nome"));
           fruta.setCor_predominante(rs.getString("cor_predominante"));
        }
            
        rs.close();
        stmt.close();
        
        return fruta;
    }

    @Override
    public List<Fruta> obterTodos() throws SQLException {
        List<Fruta> frutas = new ArrayList<>();
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM fruta;
                                                          """);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
           Fruta fruta = new Fruta();
           fruta.setId(rs.getInt("id"));
           fruta.setNome(rs.getString("nome"));
           fruta.setCor_predominante(rs.getString("cor_predominante"));
           frutas.add(fruta);
        }
            
        rs.close();
        stmt.close();
        
        return frutas;
    }
    
}
