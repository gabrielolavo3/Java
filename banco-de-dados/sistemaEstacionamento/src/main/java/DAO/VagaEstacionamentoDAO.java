/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.VagaEstacionamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VagaEstacionamentoDAO 
{
    Connection abrirConexao;
    PreparedStatement envioDadosSql;
    ArrayList <VagaEstacionamentoDTO> arrayVaga = new ArrayList<>();
    ResultSet resultado;
    
    public void alterarStatusDaVaga(VagaEstacionamentoDTO vagaDTO)
    {
        String sql = "UPDATE Vaga SET statusVaga = ? WHERE idVaga = ?";
        abrirConexao = new Conexao().conectaBD();
        
        try 
        {
            envioDadosSql = abrirConexao.prepareStatement(sql);
            envioDadosSql.setString(1, vagaDTO.getSitucao());
            envioDadosSql.setInt(2, vagaDTO.getIdVaga());
            envioDadosSql.execute();
            envioDadosSql.close();
            
            JOptionPane.showMessageDialog(null, "Alteração no status da vaga realizada com sucesso!");
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + " : Classe de VagaEstacionamentoDAO");
        }
    }
}
