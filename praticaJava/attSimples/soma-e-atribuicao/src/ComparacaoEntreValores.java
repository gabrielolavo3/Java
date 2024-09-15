/* Descrição  : Ler os valores de A, B, C e em seguida imprime a soma entre A e B e mostrar se a soma é menor que C! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 24/02/2024 */

import java.util.Scanner;

public class ComparacaoEntreValores {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e configuração de leitor

        int A;
        int B;
        int C;
        int soma_AeB;
        String resultado;

        Scanner leitorNumerico = new Scanner (System.in);

        // Solicitando dados

        System.out.print ("Digite um valor para a posição A: ");
        A = leitorNumerico.nextInt();
        System.out.print ("Digite um valor para a posição B: ");
        B = leitorNumerico.nextInt();
        System.out.print ("Digite um valor para a posição C: ");
        C = leitorNumerico.nextInt();

        soma_AeB = A + B;
        resultado = (soma_AeB > C) ? "A soma dos valores é maior do que o valor de C" : "A soma dos valores é menor do que o valor de C";

        // Tela de resultado

        System.out.print("\033[2J"); // Limpa terminal no integradTerminal
        System.out.println ("Soma entre as posições A e B: " + soma_AeB);
        System.out.println ("Comparação com a posição C: " + resultado);

    }
}
