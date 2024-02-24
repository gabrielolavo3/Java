import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws Exception {
        int valor;
        short numero;
        byte algarismo;
        long simbolo;
        float segundoValor;
        double terceiroValor;
        char letra;
        String palavra;
        String nomecompleto;

        // Criação de Classe para ler dados --> Scanner nomeDaVariavel = new Scanner (System.in)
        // Scanner = classe que ler diferentes tipos de dados | leitorInt = nomeDaVariavel | new Scanner = nova leitura | (System.in) = entrada pelo teclado
        // Se for para variáveis da messa classe, um único Scanner serve
        Scanner leitorInt = new Scanner(System.in); 
     
        // LEITURA DE VARIÁVEIS INTEIRAS --> Byte, Short, Int e Long
        
        System.out.print ("Digite um número para Int: ");
        valor = leitorInt.nextInt(); // --> Necessário para informar que a variável receberá um valor 
        System.out.format ("Digite um número para Byte: ");
        algarismo = leitorInt.nextByte(); // --> 2ª versão: algarismo = (byte) leitorInt.nextInt();
        System.out.println ("Digite um número para Short: ");
        numero = (short) leitorInt.nextInt();
        System.out.println ("Digite um valor para Long: ");
        simbolo = leitorInt.nextLong();
        
        // O next() ler a próxima informação do console
        
        System.out.println ("Número Int digitado: " + valor);
        System.out.println ("Número Byte digitado: " + algarismo);
        System.out.println ("Número de Short digitado: " + numero);
        System.out.println ("Número de Long digitado: " + simbolo);

        // LEITURA DE VARIÁVEIS PONTO FLUTUANTE (DECIMAIS) --> Float e Double
        
        Scanner leitorFlutuante = new Scanner(System.in);
        System.out.println ("\nInsira o valor de Float: ");
        segundoValor = leitorFlutuante.nextFloat();
        System.out.format ("Insira o valor de Double: ");
        terceiroValor = leitorFlutuante.nextDouble();
        
        System.out.format ("Número Float: %.2f", segundoValor);
        System.out.format ("Número Double: %.2f", terceiroValor);
        
        
        // LEITURA DE CARACTERE --> Char e String
        
        Scanner leitorCaracter = new Scanner(System.in);
        Scanner leitorString = new Scanner (System.in);
        Scanner leitorDoisDeString = new Scanner (System.in);
        
        leitorDoisDeString.useDelimiter("[;\r\n]+"); // Configura o leitor para String (a quebra de linha pode ser \r OU \n OU ;) 
        // O + diz que a quebra pode se repetir --> Retira o problema do .next()
        
        System.out.println ("Aperte uma letra: ");
        letra = leitorCaracter.next().charAt(0); // Ler apenas o 1º caracter digitado, apagando qualquer outro
        System.out.println ("Digite uma palavra: ");
        palavra = leitorString.next(); // Ler apenas uma palavra. O Java entende que o espaço é quebra de linha e ignorar o que vem de
        System.out.println ("Digite o seu nome completo: ");
        nomecompleto = leitorDoisDeString.next();  // Alternativa --> nomecompleto = leitorString.nextLine(); | Com ele, não precisa do useDelimiter ("[;\r\n]+")
        
        System.out.println ("Letra: " + letra);
        System.out.println ("Palavra: " + palavra);
        System.out.println("Seu nome: " + nomecompleto);
        
        // Convertendo String em numero
        
        String livro;
        int quantidade;
        String valor2;
        String autor;

        Scanner leitorLetra = new Scanner(System.in);

        System.out.println ("Digite o nome do seu livro favorito: ");
        livro = leitorLetra.nextLine();
        System.out.println ("Digite quantos livros você possui: ");
        valor2 = leitorInt.nextLine();
        quantidade = Integer.parseInt(valor2); // Converter String em número | Float.parseFloat(String) Double.parseDouble(String)
        // Integer = Int

        System.out.println ("Digite o nome de um autor: ");
        autor = leitorLetra.nextLine();

        System.out.println ("Livro: " + livro);
        System.out.println ("Quantidade de livros: " + quantidade);
        System.out.println ("Autor: " + autor);

    }
}
