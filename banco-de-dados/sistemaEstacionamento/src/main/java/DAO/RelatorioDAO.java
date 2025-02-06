/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.RelatorioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class RelatorioDAO 
{
    Connection abrirConexao;
    PreparedStatement envioDadosSql;
    ArrayList <RelatorioDTO> relatorio = new ArrayList<>();
    ResultSet resultado;
    
    public ArrayList<RelatorioDTO> GerarRelatorio()
    {
        String sql = "SELECT * FROM Relatorio";
        abrirConexao = new Conexao().conectaBD();
        
        try 
        {
            envioDadosSql = abrirConexao.prepareStatement(sql);
            resultado = envioDadosSql.executeQuery();
            
            while(resultado.next())
            {                
               RelatorioDTO relatorioDTO = new RelatorioDTO();
               relatorioDTO.setIdRelatorio(resultado.getInt("id"));
               relatorioDTO.setFKveiculo(resultado.getString("fkVeiculo"));
               relatorioDTO.setFKvaga(resultado.getInt("fkVaga"));
               relatorioDTO.setFKpagamento(resultado.getInt("fkPagamento"));
               
               relatorio.add(relatorioDTO);
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return relatorio;
    }
}
