package DAO;

import DTO.GrupoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GrupoDAO 
{
    Connection conexao;
    PreparedStatement envioSQL;
    ArrayList<GrupoDTO> arrayGrupo = new ArrayList<>();
    ResultSet result;
    
    public void criarGrupo(GrupoDTO grupodto)
    {
        String sqlInsert = "INSERT INTO Grupo(nomeGrupo, descricao, dtCriacao) VALUES(?, ?, ?)";        
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlInsert);
            envioSQL.setString(1, grupodto.getNomeGrupo());
            envioSQL.setString(2, grupodto.getDescricao());
            envioSQL.setString(3, grupodto.getDataCriacao());
            envioSQL.execute();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Grupo criado com sucesso!");
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "GrupoDAO");
        }
        
    }
    
    public ArrayList<GrupoDTO> BuscarGrupos()
    {
        String sqlSelect = "SELECT * FROM Grupo";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlSelect);
            result = envioSQL.executeQuery();
            
            while(result.next())
            {
                GrupoDTO grupodto = new GrupoDTO();
                grupodto.setIdGrupo(result.getInt("idGrupo"));
                grupodto.setNomeGrupo(result.getString("nomeGrupo"));
                grupodto.setDescricao(result.getString("descricao"));
                grupodto.setDataCriacao(result.getString("dataCriacao"));
                
                arrayGrupo.add(grupodto);
            }
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "Select");
        }
        
        return arrayGrupo;
    }
    
    public void atualizarGrupo(GrupoDTO grupodto)
    {
        String sqlUpdate = "UPDATE Grupo SET nomeGrupo = ?, descricao = ?, dtCriacao = ? WHERE idGrupo = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);
            envioSQL.setString(1, grupodto.getNomeGrupo());
            envioSQL.setString(2, grupodto.getDescricao());
            envioSQL.setString(3, grupodto.getDataCriacao());
            envioSQL.setInt(4, grupodto.getIdGrupo());
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Grupo atualizado!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Update");
        }        
    }
    
    public void excluirGrupo(GrupoDTO grupodto)
    {
        String sqlUpdate = "DELETE FROM Grupo WHERE idGrupo = ?";
        conexao = new ConexaoAgendaBD().abrirConexao();
        
        try 
        {
            envioSQL = conexao.prepareStatement(sqlUpdate);            
            envioSQL.setInt(1, grupodto.getIdGrupo());            
            envioSQL.executeUpdate();
            envioSQL.close();
            
            JOptionPane.showMessageDialog(null, "Grupo deletado!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e + "Delete");
        }        
    }
}