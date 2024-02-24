import javax.swing.JOptionPane;

public class Booleano {
    public static void main(String[] args) throws Exception {
        byte idade = 2;
        short numero = 1000;
        String nome = "Gabriel";
        String segundoNome = "João";

        boolean comparacao = idade != numero;
        comparacao = numero == numero;
        comparacao = nome == segundoNome;
        comparacao = 5 >= 10;
        comparacao = 10 <= 12;
        comparacao = numero > 569;

        //System.out.println ("Resultado: " + comparacao);

        boolean cop;

        cop = 5 >= 4 && 3 == 2;
        cop = 6 == 6 || 9 <= 5;

        JOptionPane.showMessageDialog(null, !cop);

        /* OPERADORES RELACIONAIS
        > Maior que
        < Menor que
        >= Maior ou igual a 
        <= Menor ou igual a
        == Igual a
        != Diferente de

        OPERADORES LÓGICOS

        && --> And (E) | É true quando tudo é true
        || --> Or (OU) | É true quando há pelo menos um true
        ! --> Not (NEGAÇÃO) | Inverte o valor, true = false e false = true
         */
    }
}
