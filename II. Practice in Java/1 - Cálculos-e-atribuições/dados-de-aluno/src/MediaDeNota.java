/* 
Descrição  : Ler a idade, nome e 4 notas de um estudante. No final, calcular a média de notas e imprimir os dados! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 25/02/2024 */

import java.util.Scanner;

public class MediaDeNota {
    public static void main(String[] agrs) throws Exception {
        // Declaração de variáveis e configuração de leitor

        byte idade;
        float media;
        float primeiraNota, segundaNota, terceiraNota, quartaNota;
        String nomeDoAluno;

        Scanner leitorNota = new Scanner(System.in);
        Scanner leitorDeIdade = new Scanner(System.in);
        Scanner leitorNome = new Scanner(System.in);
        leitorNome.useDelimiter("[\r\n]");

        // Solicitando dados

        System.out.println("CÓLEGIO SAN PETERSON\n");
        System.out.print ("Digite o nome do estudante: ");
        nomeDoAluno = leitorNome.next();
        System.out.print ("Digite a idade (em anos): ");
        idade = leitorDeIdade.nextByte();
        System.out.print ("\nDigite a 1ª nota: ");
        primeiraNota = leitorNota.nextFloat();
        System.out.print ("Digite a 2ª nota: ");
        segundaNota = leitorNota.nextFloat();
        System.out.print ("Digite a 3ª nota: ");
        terceiraNota = leitorNota.nextFloat();
        System.out.print ("Digite a 4ª nota: ");
        quartaNota = leitorNota.nextFloat();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        // Tela de resultado

        System.out.print("\033[2J");
        System.out.println("CÓLEGIO SAN PETERSON\n");
        System.out.println ("Nome do estudante: " + nomeDoAluno);
        System.out.println ("Idade do estudante: " + idade + " anos");
        System.out.format ("\n1ª nota: %.2f\n", primeiraNota);
        System.out.format ("2ª nota: %.2f\n", segundaNota);
        System.out.format ("3ª nota: %.2f\n", terceiraNota);
        System.out.format ("4ª nota: %.2f\n\n", quartaNota);
        System.out.format ("Média anual: %.2f", media);

    }
}
