/* 
Descrição  : Ler 1 número inteiro e imprimir a quantidade de divisores que o valor possui! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 23/03/2024 */

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) throws Exception {

        // Declaração de variáveis e leitor
        
        int numero;
        int contador;
        int restoDivisao = 0;

        Scanner atribuidor =  new Scanner(System.in);

        // Solicitando dados

        System.out.println("CALCULADORA - DIVISORES\n");
        System.out.print ("Insira um número inteiro: ");
        numero = atribuidor.nextInt();

        for (contador = 1; contador <= numero; contador++) {
            if (numero % contador == 0)
                restoDivisao++;
        }

        // Tela de resultado

        System.out.print("\033[2J");
        System.out.println("CALCULADORA - DIVISORES\n");
        System.out.printf("Quantidade de divisores de %d: %d", numero, restoDivisao);

    }
}
