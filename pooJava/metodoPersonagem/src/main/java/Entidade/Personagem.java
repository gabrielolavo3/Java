package Entidade;

import java.util.Random;

public class Personagem {
    public String nome;
    public int forca;
    public int nivel;
    public String armamento;
    
    // Criando um método/ação void (sem retorno) da Class Personagem
    
    public void statusPersonagem() 
    {
        System.out.printf("Personagem: %s (nível %d), possui %d de força e %s como armamento", nome, nivel, forca, armamento);
    }
    
    public void atacar(String inimigo) 
    {
        System.out.printf("%s atacou %s com %s", nome, inimigo, armamento);
    }
    
    // Criando método com retorno
    
    public int danoRecebido() 
    {
        int dano;
        
        // Objeto Random para número aleatório
        Random gerador = new Random();
        
        // Criando número aleatório de 1 a 50
        dano = gerador.nextInt(50) + 1; 
        return dano;
    }
    
    public void contraAtacar(int decisao) 
    {        
        int danoTotal = danoRecebido(); // Atribuindo retorno de método para variável local
        int danoInimigo = danoRecebido() + forca;
        
        if (decisao == 1) {
            System.out.printf("%s fez o contra ataque e evitou %d de dano do inimigo\n", nome, danoTotal);
        
        } else {
            System.out.printf("%s recebeu %d de dano do inimigo", nome, danoInimigo);
        }
    }
}
