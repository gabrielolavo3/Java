/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoAgendaBD 
{
    public Connection abrirConexao()
    {
        Connection conexao = null;
        
        try 
        {
            String url = "jdbc:mysql://localhost/agenda?user=root&password=12345678";
            conexao = DriverManager.getConnection(url);
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        
        return  conexao;
    }
}