/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto2carros;

import dao.CarroDAO;
import entidades.Carro;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Machado
 */
public class Projeto2Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CarroDAO dao = new CarroDAO();
            
            Carro c = new Carro();
            
            c.setAno_fabricacao(2000);
            c.setModelo("HB20");
            
            dao.excluir(c);
            dao.fecharConexao();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
