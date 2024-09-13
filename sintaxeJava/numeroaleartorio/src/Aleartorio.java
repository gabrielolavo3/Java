import java.util.Random;
import javax.swing.JOptionPane;

public class Aleartorio {
    public static void main(String[] args) throws Exception {
        double dado;
        int valor;
        int segundoValor;

        dado = Math.random(); // Math.random retorna um valor double entre 0.0 e 1.0
        dado = Math.random() * 2; // Ao multiplicar, aumenta a quantidade de números aleartórios, mas não chega ao valor máximo
        dado = 1 + Math.random() * 2; // Definindo o valor mínimo e máximo com double (1: min E 2:max)
        valor = 1 + (int) (Math.random() * 3); // Realiza o Math.random, transforma em int e soma + 1 | a soma pode vir no final da linha

        Random dadoLado = new Random(); // Classe Random --> O Math.random usa o objeto Random abstratamente | Random é o melhor
        valor = dadoLado.nextInt(200) + 1; // Vai de 1 até 200

        Random dadoLado2 = new Random(10); // Dentro do parentese, há a Seed que define um valor e deixa de ser aleartório
        segundoValor = 1 + dadoLado2.nextInt(100);

        // JOptionPane.showMessageDialog(null, segundoValor);

        // JOGO DE LANÇAR DADOS

        int faceDado;
        int resultado;

        Random ladoDoDado = new Random();
        faceDado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de lados do dado")); // Convertendo o JOptionPane para int
        resultado = ladoDoDado.nextInt(faceDado) + 1;

        JOptionPane.showMessageDialog(null, "Você tirou " + resultado + " no dado");
    }
}
