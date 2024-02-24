/* Descrição  : Ler o nome e depois o sobrenome do usuário. Imprimir o nome completo no final! (função)
Autor(a)   : Gabriel S. Olavo
Data atual : 24/02/2024 */

import java.util.Scanner;

public class LeituraDeNome {
    public static void main(String[] args) throws Exception {
        
        // Declaração de variáveis e configuração de leitor

        String nome;
        String sobrenome;

        Scanner leitorDeNome = new Scanner (System.in);
        leitorDeNome.useDelimiter("[\r\n]+"); // Usado junto ao .next

        // Solicitando dados

        System.out.println ("REGISTRO NACIONAL DE NOMES\n");
        System.out.print ("Digite o seu nome: ");
        nome = leitorDeNome.next();
        System.out.print ("Digite o seu sobrenome: ");
        sobrenome = leitorDeNome.next();

        // Tela de resultado

        System.out.format ("\nO seu nome completo é %s %s", nome, sobrenome);
    }
}
