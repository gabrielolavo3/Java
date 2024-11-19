/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author aluno.den
 */
public class FuncionarioDTO {
    
    private String nomeFuncionario, cidadeFuncionario;
    private int id;

 
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

  
    public String getCidadeFuncionario() {
        return cidadeFuncionario;
    }

   
    public void setCidadeFuncionario(String cidadeFuncionario) {
        this.cidadeFuncionario = cidadeFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
}