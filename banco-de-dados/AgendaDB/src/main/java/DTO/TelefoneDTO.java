/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Administrador
 */
public class TelefoneDTO 
{
    private int idTelefone;
    private String ddd;
    private String numTelefone;
    private int FKPessoa;

    public int getIdTelefone() 
    {
        return idTelefone;
    }
    
    public void setIdTelefone(int idTelefone) 
    {
        this.idTelefone = idTelefone;
    }

    public String getDdd() 
    {
        return ddd;
    }

    public void setDdd(String ddd) 
    {
        this.ddd = ddd;
    }

    public String getNumTelefone() 
    {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) 
    {
        this.numTelefone = numTelefone;
    } 
    
    public int getFKPessoa() 
    {
        return FKPessoa;
    }
    
    public void setFKPessoa(int FKPessoa) 
    {
        this.FKPessoa = FKPessoa;
    }
}