/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TicketDTO;
import DTO.VagaEstacionamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class TicketDAO 
{
    Connection abrirConexao;
    PreparedStatement envioDadosSql;
    ArrayList <TicketDTO> ticket = new ArrayList<>();
    ResultSet resultado;
    
    public ArrayList<TicketDTO> GerarTicket()
    {
        String sql = "SELECT * FROM Ticket WHERE Veiculo_idVeiculo = ?";
        abrirConexao = new Conexao().conectaBD();
        
        try 
        {
            envioDadosSql = abrirConexao.prepareStatement(sql);
            
            TicketDTO ticketDTO = new TicketDTO();
            
            envioDadosSql.setString(1, ticketDTO.getFKVeiculo());
            resultado = envioDadosSql.executeQuery();
            
            while(resultado.next())
            {                
                ticketDTO.setIdTicket(resultado.getInt("idTicket"));
                ticketDTO.setFKVeiculo(resultado.getString("fkVeiculo"));
                ticket.add(ticketDTO);
            }
        } 
        catch (Exception e) 
        {
            
        }
        
        return ticket;
    }
}
