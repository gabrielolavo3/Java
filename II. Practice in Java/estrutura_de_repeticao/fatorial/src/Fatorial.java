/* 
Descrição  : Ler um número e imprimir o fatorial! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 23/03/2024 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e leitor

        int valor;
        int contador;
        int fatorial = 1;

        Scanner leitor = new Scanner(System.in);

        // Solicitando dados

        System.out.print ("Digite um número positivo: ");
        valor = leitor.nextInt();

        while (valor <= 0) {
            System.out.println("\nSomente números acima de 0 e positivos são aceitos\n");
            System.out.print ("Digite um número positivo e diferente de 0: ");
            valor = leitor.nextInt();
        }

        for (contador = 1 ; contador <= valor; contador++) {
            fatorial *= contador;
        }

        // Tela de resultado

        System.out.printf("\nO fatorial de %d é %d ", valor, fatorial);
    }
}
