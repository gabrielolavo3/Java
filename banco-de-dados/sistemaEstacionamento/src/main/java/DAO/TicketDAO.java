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
}
