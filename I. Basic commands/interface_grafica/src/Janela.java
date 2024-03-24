import javax.swing.JOptionPane;

public class Janela {
    public static void main(String[] args) throws Exception {
        int numero;
        String nome;
        String texto_numero;

        // Configurando janela para entrada de dados

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?", "Java Test", JOptionPane.INFORMATION_MESSAGE);
        texto_numero = JOptionPane.showInputDialog(null, "Digite um número", "Java Number Test", JOptionPane.WARNING_MESSAGE);

        numero = Integer.parseInt(texto_numero);
        numero = numero * 10; // JOptionPane sempre retorna uma String

        // Configurando janela para impressão de dados

        JOptionPane.showMessageDialog(null, "Nome do usuário: " + nome, "Java Result", JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null, "Número multiplicado por: " + numero, "Java Number", JOptionPane.QUESTION_MESSAGE);

    }
}
