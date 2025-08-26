/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padroesempratica;

import dao.PaisDAO;
import entidades.Pais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bv3032477
 */
public class PadroesEmPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PaisDAO dao = new PaisDAO();
            
            for(Pais p: dao.obterTodos()){
                System.out.println(p);
            }
            
            
            dao.fecharConexao();
            
        } catch (SQLException ex) {
            Logger.getLogger(PadroesEmPratica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    
}
