/* 
Descrição  : Ler os valores da altura e base de um triângulo, em cm, inseridos pelo usuário. No final, exiba o valor da área do triângulo! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 25/02/2024 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis e configuração de leitor

        float base;
        float altura;
        float valorDaArea;
        Scanner leitorTriangulo = new Scanner (System.in);

        // Solicitando dados

        System.out.println ("CALCULADORA DE ÁREA DO TRIâNGULO\n");
        System.out.print ("Digite o valor da base do triângulo: ");
        base = leitorTriangulo.nextFloat();
        System.out.print ("Digite o valor da altura do triângulo: ");
        altura = leitorTriangulo.nextFloat();

        valorDaArea = (base * altura) / 2;

        // Tela de resultado

        System.out.print ("\033[2J");
        System.out.println ("CALCULADORA DE ÁREA DO TRIâNGULO\n");
        System.out.println ("Base do triângulo: " + base);
        System.out.println ("Altura do triângulo: " + altura);
        System.out.format ("\nResultado: o valor da área é %.2f", valorDaArea);
    }
}
