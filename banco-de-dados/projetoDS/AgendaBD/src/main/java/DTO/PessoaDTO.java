/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Administrador
 */
public class PessoaDTO 
{
    private int idPessoa;
    private String nomePessoa;
    private String sobrenome;
    private String email;
    private int idade;
    
    public int getIdPessoa()
    {
        return idPessoa;
    }
    
    public String getNomePessoa()
    {
        return nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa)
    {
        this.nomePessoa = nomePessoa;
    }
    
    public String getSobrenome()
    {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
}
