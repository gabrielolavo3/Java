//import java.sql.Struct;

public class Dados {
    public static void main(String[] args) throws Exception {
        
        // Variáveis do tipo Inteiro

        byte idade = 22; // É a menor medida, fica entre -128 e 127 | tem 8 bits = 1 byte
        short populacao = -30000; // 2ª menor medida. fica entre -32768 e 32767 | tem 16 bits = 2 byte
        int numeroGrande = 2147483647; // É 2ª maior e maior do que short, fica entre -2.147.483.648 e 2.147.483.647 | tem 32 bits = 4 byte
        long valorEnorme = 7974897789474894948L; // É o maior entre os inteiros, fica entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807 | tem 64 bits = 8 byte

        // O valor de Long precisa de L para diferenciar de um Int

        // Variáveis de Ponto Flutuante

        float valor = 68.90F; // Acumular 38 números após a virgula em positivos e 37 para negativos
        double valorPI = 3.14159265358979323846; // É maior do que o float, pondedo acumular mais casa decimais

        // O valor de Float precisa de F ao final para diferenciar de um Double

        // Variáveis de Caractere

        char sinal = 'A'; // Armazena 1 caracter e precisa estar entre aspas simples

        // Tipo booleano (Boolean) -> Retorna um valor lógico: falso (false) e verdadeiro (true)

        boolean casaVerde = false;
        boolean lapisAzul = true;

        // Tipo String -> cadeia/vetor de caracter

        String nome = "Gabriel Olavo"; // Precisa está entre aspas duplas
        String frase = "Esse código é em Java"; // String não é um tipo primitivo

        // TELA DE RESULTADO

        System.out.println (nome);
        System.out.println (valorPI);
        System.out.println (numeroGrande);
    }
}
