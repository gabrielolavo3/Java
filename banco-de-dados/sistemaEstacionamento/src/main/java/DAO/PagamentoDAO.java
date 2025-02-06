/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PagamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class PagamentoDAO 
{
    Connection abrirConexao;
    PreparedStatement envioDadosSql;
    ArrayList <PagamentoDTO> pagamento = new ArrayList<>();
    ResultSet resultado;
    
    public void inserirPagamento(PagamentoDTO pagamentoDTO)
    {
        String sql = "INSERT INTO Pagamento(Veiculo_idVeiculo, Vaga_idVaga, Valor, Data_hora, Tipo_Pagamento) VALUES (?, ?, ?, ?, ?)";
        abrirConexao = new Conexao().conectaBD();
        
        try 
        {
            envioDadosSql = abrirConexao.prepareStatement(sql);
            envioDadosSql.setString(1, pagamentoDTO.getFKveiculo());
            envioDadosSql.setInt(2, pagamentoDTO.getFKvaga());
            envioDadosSql.setFloat(3, pagamentoDTO.getValor());            
            envioDadosSql.setInt(4, pagamentoDTO.getDataHora());  
            envioDadosSql.setString(5, pagamentoDTO.getTipoPagamento());
            envioDadosSql.execute();
            envioDadosSql.close();
            
            JOptionPane.showMessageDialog(null, "Pagamento adicionado com sucesso");
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    public ArrayList<PagamentoDTO> ImprimirPagamento()
    {
        String sql = "SELECT * FROM Pagamento";
        abrirConexao = new Conexao().conectaBD();
        
        try 
        {
            envioDadosSql = abrirConexao.prepareStatement(sql);
            resultado = envioDadosSql.executeQuery();
            
            while(resultado.next())
            {                
               PagamentoDTO pagamentoDTO = new PagamentoDTO();
               pagamentoDTO.setIdPagamento(resultado.getInt("id"));
               pagamentoDTO.setFKveiculo(resultado.getString("fkVeiculo"));
               pagamentoDTO.setFKvaga(resultado.getInt("fkVaga"));
               pagamentoDTO.setValor(resultado.getFloat("valor"));
               pagamentoDTO.setDataHora(resultado.getInt("dataHora"));
               pagamentoDTO.setTipoPagamento(resultado.getString("tipoPgamento"));
               
               
               pagamento.add(pagamentoDTO);
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return pagamento;
    }
}
