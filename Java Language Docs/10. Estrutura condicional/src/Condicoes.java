public class Condicoes {
    public static void main(String[] args) throws Exception {
        String filme = "Clube da Luta";
        String segundoFilme = "Deadpool";
        String qualidade;

        // OPERAÇÃO TERNÁRIA

        qualidade = (filme == "Clube da Luta") ? "Ótimo filme" : "Não é um filme bom";
        System.out.println (qualidade);

        // ESTRUTURA

        if (segundoFilme == "Clube da Luta") {
            System.out.println ("O filme " + segundoFilme + " é bom");
        } else {
            System.out.println ("O filme não é conhecido");
        }

        // ESTRUTURA SEM CHAVES --> Executa apenas a próxima linha e sai da estrutura

        if (filme == "Clube da Luta") 
            System.out.println (true);

        if (qualidade == "Ótimo filme" && filme == "Vingadores")
            System.out.println (true);
        else
            System.out.println (false);
        
    }
}
