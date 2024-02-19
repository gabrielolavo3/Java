public class Concatenado {
    public static void main(String[] args) throws Exception {
        
        // DeclaraÃ§Ã£o de variÃ¡veis
        
        String nome = "Marta";
        float altura = 1.68F;
        byte idade = 21;
        char letraInicial = 'M';
        boolean eNegra = true;

        System.out.println (nome);
        System.out.println (altura);
        System.out.println (idade);
        System.out.println (letraInicial);
        System.out.println (eNegra);
        
        // ConcatenaÃ§Ã£o com as variÃ¡veis

        System.out.println ("\nNome da entrevistada: " + nome);
        System.out.println ("Altura da entrevistada: " + altura);
        System.out.println ("Idade da entrevistada: " + idade);
        System.out.println ("Letra inicial do nome: " + letraInicial);
        System.out.println ("Ã negra? : " + eNegra);
        // Nessa 1Âª concatenaÃ§Ã£o, Ã© preciso um espaÃ§o para que haja a formataÃ§Ã£o correta, antes de adicionar a variÃ¡vel

        System.out.println ("\nA entrevistada " + nome + " possui " + idade + " anos de idade, com " + altura + " de altura. Sua letra inicial Ã© " + letraInicial);
        
        System.out.format ("A entrevistada %s tem %.2f de altura e %d anos de idade. Sua letra Ã© %c\n\n", nome, altura, idade, letraInicial);
        // No System.out.format precisa de \n para quebra de linha. No System.out.println, o ln faz o papel de \n

        // ConcatenaÃ§Ã£o com String

        String texto = "A entrevistada " + nome + " possui " + idade + " anos de idade, com " + altura + " de altura. Sua letra inicial Ã© " + letraInicial;
        System.out.println (texto);
        
        String Segundo_texto = String.format ("A entrevistada %s tem %.2f de altura e %d anos de idade. Sua letra Ã© %c\n", nome, altura, idade, letraInicial);
        System.out.println (Segundo_texto); // Aqui, sem o String.format, o comando nÃ£o funciona e nÃ£o imprime

        // FormataÃ§Ã£o de texto com String

        String linguagem = "Agora tá usando a linguagem de programaÃ§Ã£o Java. ";
        String aprendizagem = "Estou aprendendo 'sozinho', pelo YT. ";
        String primeiraLinguagem = "Minha 1Âª linguagem foi a C. ";
        short anoFinal = 2025;

        String mensagemFinal = primeiraLinguagem + linguagem + aprendizagem;
        System.out.println (mensagemFinal);

        String mensagemAlternativa = String.format("%s%s%sEspero aprender até %d", linguagem, aprendizagem, primeiraLinguagem, anoFinal); 
        System.out.println (mensagemAlternativa); // Aqui, sem o String.format, o comando nÃ£o funciona
    }
}
