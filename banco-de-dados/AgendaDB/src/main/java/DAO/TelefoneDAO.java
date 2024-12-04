package DAO;

import DTO.TelefoneDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelefoneDAO 
{
    Connection conexao;
    PreparedStatement envioSQL;
    ArrayList<TelefoneDTO> listaContatos = new ArrayList<>();
    ResultSet result;
    
    public void adicionarContato(TelefoneDTO telefonedto)
    {
        String sqlInsert = "INSERT INTO Telefone(ddd, telefone, fk_pessoa_idPessoa) VALUES(?, ?, ?)";        
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlInsert);
            envioSQL.setString(1, telefonedto.getDdd());
            envioSQL.setString(2, telefonedto.getNumTelefone());
            envioSQL.setInt(3, telefonedto.getFKPessoa());          
            envioSQL.execute();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Telefone registrado!");
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "TelefoneDAO");
        }
        
    }
    
    public ArrayList<TelefoneDTO> ConsultarContatos()
    {
        String sqlSelect = "SELECT * FROM Telefone";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlSelect);
            result = envioSQL.executeQuery();
            
            while(result.next())
            {
                TelefoneDTO telefonedto = new TelefoneDTO();
                telefonedto.setIdTelefone(result.getInt("idTelefone"));
                telefonedto.setDdd(result.getString("ddd"));
                telefonedto.setNumTelefone(result.getString("telefone"));
                telefonedto.setFKPessoa(result.getInt("FKPessoa"));
                
                listaContatos.add(telefonedto);
            }
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "Select");
        }
        
        return listaContatos;
    }
    
    public void atualizarContato(TelefoneDTO telefonedto)
    {
        String sqlUpdate = "UPDATE Telefone SET ddd = ?, telefone = ?, fk_pessoa_idPessoa = ? WHERE idTelefone = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);
            envioSQL.setString(1, telefonedto.getDdd());
            envioSQL.setString(2, telefonedto.getNumTelefone());
            envioSQL.setInt(3, telefonedto.getFKPessoa()); 
            envioSQL.setInt(4, telefonedto.getIdTelefone());
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Contato foi atualizado!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Update");
        }        
    }
    
    public void deletarContato(TelefoneDTO telefonedto)
    {
        String sqlUpdate = "DELETE FROM Telefone WHERE idTelefone = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);            
            envioSQL.setInt(1, telefonedto.getIdTelefone());            
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Contato deletado com sucesso!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Delete");
        }        
    }
}