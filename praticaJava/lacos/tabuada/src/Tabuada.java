/* 
Descrição  : Ler 1 número e imprimir a tabuada do número inserido! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 03/03/2024 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e configuração de leitor

        short valor;
        byte contador = 0;
        Scanner leitorShort = new Scanner(System.in);

        // Solicitando dados

        System.out.print("Digite um valor: ");
        valor = leitorShort.nextShort();

        // Tela de resultado

        System.out.print ("\033[2J");
        System.out.printf ("TABUADA DE %d\n\n", valor);
        for (contador = 1; contador <= 10; contador++) {
            System.out.printf ("%d x %d = %d\n", valor, contador, valor * contador);
        }
    }
}
