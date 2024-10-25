
package br.com.construtor.construtorpersonagem;

import entidade.Personagem;
import javax.swing.JOptionPane;

public class ConstrutorPersonagem 
{
    public static void main(String[] args) 
    {
        
        // Declaração de objetos, instânciamento e passagem de parâmetro do Construtor
        // Usando janela gráfica do Java
        
        String nome = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem: ");
        
        Personagem personagem = new Personagem(nome, classe);
        personagem.mostrarStatus();
    }
}
