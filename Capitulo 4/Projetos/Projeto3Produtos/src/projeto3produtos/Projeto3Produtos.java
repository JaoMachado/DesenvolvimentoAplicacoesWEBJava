/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto3produtos;
import dao.ProdutoDAO;
import entidades.Produto;

/**
 *
 * @author João Pedro Machado
 */
public class Projeto3Produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ProdutoDAO dao = new ProdutoDAO();
            
            for(Produto p: dao.obterTodos()){
                System.out.println(p);
            }
            
            dao.fecharConexao();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
