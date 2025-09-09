/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes.servicos;

import cadastroclientes.dao.CidadeDAO;
import cadastroclientes.entidades.Cidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Machado
 */
public class CidadeServices {
    public List<Cidade> getTodos() {

        List<Cidade> lista = new ArrayList<>();
        CidadeDAO dao = null;

        try {
            dao = new CidadeDAO();
            lista = dao.listarTodos();
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            if (dao != null) {
                try {
                    dao.fecharConexao();
                } catch (SQLException exc) {
                    exc.printStackTrace();
                }
            }
        }

        return lista;

    }
}
