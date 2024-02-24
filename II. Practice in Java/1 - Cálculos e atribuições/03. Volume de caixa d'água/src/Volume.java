/* Descrição  : Ler os valores da altura, largura e profundidade de uma caixa d’água, em cm, inseridos pelo usuário. 
No final, exiba o volume dessa caixa d’água! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 24/02/2024 */

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e configuração de leitor

        float altura;
        float largura;
        float profundidade;
        float volumeTotal;

        Scanner atribuidor = new Scanner (System.in);

        // Solicitando dados

        System.out.print ("Digite a altura da caixa d'água: ");
        altura = atribuidor.nextFloat();
        System.out.print ("Digite a largura da caixa d'água: ");
        largura = atribuidor.nextFloat();
        System.out.print ("Digite a profundidade da caixa d'água: ");
        profundidade = atribuidor.nextFloat();

        volumeTotal = altura * largura * profundidade;

        System.out.println ("\033[2J");
        System.out.println ("Altura: " + altura);
        System.out.println ("Largura: " + largura);
        System.out.println ("Profundidade: " + profundidade);
        System.out.format ("Resultado do cálculo de volume: %.2f", volumeTotal);

    }
}
