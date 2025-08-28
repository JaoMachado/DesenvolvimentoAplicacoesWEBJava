/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Machado
 */
public class CarroDAO extends DAO<Carro>{
    
    public CarroDAO() throws SQLException{
        super();
    }

    @Override
    public void salvar(Carro obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            INSERT INTO carro(modelo, ano_fabricacao) VALUES (?, ?);
                                                          """);
        
        stmt.setString(1, obj.getModelo());
        stmt.setInt(2, obj.getAno_fabricacao());
        
        stmt.executeUpdate();
        stmt.close();
        
    }

    @Override
    public void atualizar(Carro obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            UPDATE carro
                                                            SET 
                                                                modelo = ?,
                                                                ano_fabricacao = ?
                                                            WHERE
                                                                id = ?;
                                                          """);
        
        stmt.setString(1, obj.getModelo());
        stmt.setInt(2, obj.getAno_fabricacao());
        stmt.setInt(3, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public void excluir(Carro obj) throws SQLException {
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            DELETE FROM carro WHERE id = ?;
                                                          """);
        
        stmt.setInt(1, obj.getId());
        
        stmt.executeUpdate();
        stmt.close();
    }

    @Override
    public Carro obterPorId(int id) throws SQLException {
        Carro c = null;
        
        PreparedStatement stmt = conexao.prepareCall("""
                                                     SELECT * FROM carro WHERE id = ?;
                                                     """);
        
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        
        if(rs.next()){
           c = new Carro();
           c.setId(rs.getInt("id"));
           c.setModelo(rs.getString("modelo"));
           c.setAno_fabricacao(rs.getInt("ano_fabricacao"));
        }
        
        rs.close();
        stmt.close();
        
        return c;
    }

    @Override
    public List<Carro> obterTodos() throws SQLException {
        List<Carro> carros = new ArrayList<>();
        
        PreparedStatement stmt = conexao.prepareStatement("""
                                                            SELECT * FROM carro;
                                                          """);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
           Carro c = new Carro();
           c.setId(rs.getInt("id"));
           c.setModelo(rs.getString("modelo"));
           c.setAno_fabricacao(rs.getInt("ano_fabricacao"));
           carros.add(c);
        }
            
        rs.close();
        stmt.close();
        
        return carros;
    }
    
    
}
