/* 
Descrição  : Ler um número inteiro e imprimir, separadamente, todos os números pares e ímpares até o valor lido! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 16/03/2024 */

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e configuração de leitor

        byte contador;
        int valor;

        Scanner leitor = new Scanner(System.in);

        // Solicitando dados e tela de resultado

        System.out.print ("Digite um valor: ");
        valor = leitor.nextInt();

        System.out.print ("\033[2J");
        System.out.println("Números pares até " + valor + " :");

        for (contador = 1; contador <= valor; contador++) {
            if (contador % 2 == 0) {
                System.out.printf ("%d ", contador);
            }
        }

        System.out.println("\n\nNúmeros ímpares até " + valor + " :");

        for (contador = 1; contador <= valor; contador++) {
            if (contador % 2 != 0) {
                System.out.printf ("%d ", contador);
            }
        }
    }
}
