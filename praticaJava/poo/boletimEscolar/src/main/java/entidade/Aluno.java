/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

public class Aluno {
    private String nome;
    private String matricula;
    private float notaA;
    private float notaB;
    private float notaC;
    
    public Aluno(String nome, String matricula)
    {
        this.nome = nome;
        this.matricula = matricula;        
    }
    
    public Aluno(float notaA, float notaB, float notaC, String nome, String matricula)
    {
        this(nome, matricula); // Chamando o Construtor 1
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
    }
    
    private float calcularMedia() 
    {
        return (notaA + notaB + notaC) / 3;
    }
    
    private String situacaoEscolar()
    {
        String status;
        if (calcularMedia() >= 7.00F && calcularMedia() <= 10.00F) {
            status = "Aprovado!";
        
        } else if (calcularMedia() >= 5.00F && calcularMedia() < 7.00F) {
            status ="Recuperação!";
        
        } else {
            status = "Reprovado!";
        }
        
        return status;
    }
    
    public String toString()
    {
        return "Aluno " + nome + " \nMatricula " + matricula + " \nMedia - " + calcularMedia() + " " +  situacaoEscolar();
    }
}
