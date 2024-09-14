package br.com.personagem.metodopersonagem;

import Entidade.Personagem;
import java.util.Scanner;

public class MetodoPersonagem {

    public static void main(String[] args) {
        
        // Declaração de Objetos e instância
        
        Personagem persoRPG = new Personagem();
        Scanner scan = new Scanner(System.in);
        
        // Atribuindo estados/valores para os atributos da Class
        
        persoRPG.nome = "Orwell";
        persoRPG.nivel = 2;
        persoRPG.forca = 20;
        persoRPG.armamento = "Espada";
        
        String alvo;
        int contraAtaque;
        
        // Chamada de método sem argumento ou parâmetro
        persoRPG.statusPersonagem();
        
        // Chamada de método com parâmetro
        System.out.print("\nQual inimigo deseja atacar? ");
        alvo = scan.nextLine();       
        persoRPG.atacar(alvo);
        
        System.out.print("\nDeseja realizar um contra ataque (1/2)? ");
        contraAtaque = scan.nextInt();
        persoRPG.contraAtacar(contraAtaque);
    }
}
