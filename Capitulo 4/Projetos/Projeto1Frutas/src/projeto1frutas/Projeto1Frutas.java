/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1frutas;

import dao.FrutaDAO;
import entidades.Fruta;
import java.sql.SQLException;

/**
 *
 * @author João Pedro Machado
 */
public class Projeto1Frutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            FrutaDAO dao = new FrutaDAO();
            System.out.println(dao.obterPorId(2));
            
            dao.fecharConexao();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
