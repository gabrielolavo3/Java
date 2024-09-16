
package br.com.construtor.construtorpersonagem;

import entidade.Personagem;

public class ConstrutorPersonagem {

    public static void main(String[] args) {
        
        // Declaração de objetos, instânciamento e passagem de parâmetro do Construtor
        Personagem personagem = new Personagem("Legolas", "Arqueiro");
        personagem.mostrarStatus();
    }
}
