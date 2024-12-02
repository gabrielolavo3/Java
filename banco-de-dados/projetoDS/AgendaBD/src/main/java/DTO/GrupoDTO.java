/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class GrupoDTO 
{
    private int id;
    private String nomeGrupo;
    private String descricao;
    private String dataCriacao;
    
    public int getId()
    {
        return id;
    }
    
    public String getNomeGrupo()
    {
        return nomeGrupo;
    }
    
    public void setNomeGrupo(String nomeGrupo)
    {
        this.nomeGrupo = nomeGrupo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDataCriacao()
    {
        return dataCriacao;
    }
    
    public void setDataCriacao(String dataCriacao)
    {
        this.dataCriacao = dataCriacao;
    }
}
