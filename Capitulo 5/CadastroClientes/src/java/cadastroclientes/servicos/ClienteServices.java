/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes.servicos;

import cadastroclientes.dao.ClienteDAO;
import cadastroclientes.entidades.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Pedro Machado
 */
public class ClienteServices {
    public List<Cliente> getTodos() {

        List<Cliente> lista = new ArrayList<>();
        ClienteDAO dao = null;

        try {
            dao = new ClienteDAO();
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
