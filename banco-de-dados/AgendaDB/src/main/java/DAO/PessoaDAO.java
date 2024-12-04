/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PessoaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDAO 
{
    Connection conexao;
    PreparedStatement envioSQL;
    ArrayList<PessoaDTO> arrayPessoa = new ArrayList<>();
    ResultSet result;
    
    public void adionarPessoa(PessoaDTO pessoadto)
    {
        String sqlInsert = "INSERT INTO Pessoa(nomePessoa, sobrenome, idade, email, fk_grupo_idGrupo) VALUES(?, ?, ?, ?, ?)";        
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlInsert);
            envioSQL.setString(1, pessoadto.getNomePessoa());
            envioSQL.setString(2, pessoadto.getSobrenome());
            envioSQL.setInt(3, pessoadto.getIdade());
            envioSQL.setString(4, pessoadto.getEmail());            
            envioSQL.setInt(5, pessoadto.getFKGrupo());            
            envioSQL.execute();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Pessoa adicionada!");
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "PessoaDAO");
        }
        
    }
    
    public ArrayList<PessoaDTO> PesquisarPessoas()
    {
        String sqlSelect = "SELECT * FROM Pessoa";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlSelect);
            result = envioSQL.executeQuery();
            
            while(result.next())
            {
                PessoaDTO pessoadto = new PessoaDTO();
                pessoadto.setIdPessoa(result.getInt("idPessoa"));
                pessoadto.setNomePessoa(result.getString("nomePessoa"));
                pessoadto.setSobrenome(result.getString("sobrenome"));
                pessoadto.setIdade(result.getInt("idade"));
                pessoadto.setEmail(result.getString("email"));
                pessoadto.setFKGrupo(result.getInt("FKGrupo"));
                
                arrayPessoa.add(pessoadto);
            }
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "Select");
        }
        
        return arrayPessoa;
    }
    
    public void atualizarDadosPessoa(PessoaDTO pessoadto)
    {
        String sqlUpdate = "UPDATE Pessoa SET nomePessoa = ?, sobrenome = ?, idade = ?, email = ?, fk_grupo_idGrupo = ? WHERE idPessoa = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);
            envioSQL.setString(1, pessoadto.getNomePessoa());
            envioSQL.setString(2, pessoadto.getSobrenome());
            envioSQL.setInt(3, pessoadto.getIdade());
            envioSQL.setString(4, pessoadto.getEmail());            
            envioSQL.setInt(5, pessoadto.getFKGrupo());            
            envioSQL.setInt(6, pessoadto.getIdPessoa());
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Informações atualizadas!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Update");
        }        
    }
    
    public void excluirPessoa(PessoaDTO pessoadto)
    {
        String sqlUpdate = "DELETE FROM Pessoa WHERE idPessoa = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);            
            envioSQL.setInt(1, pessoadto.getIdPessoa());            
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Delete");
        }        
    }
}