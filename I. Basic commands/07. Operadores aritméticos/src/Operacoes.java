import javax.swing.JOptionPane;

public class Operacoes {
    public static void main(String[] args) throws Exception {
        
        short primeiroNumero = 10;
        short segundoNumero = 5;
        int resultadoSoma;
        int resultado_Subtracao;
        int resultado_Multi;
        int resultado_Div;
        int restoDaDivisao;
        long contador = 0;
        int segundoContador = 1;

        // Operação de soma
        resultadoSoma = primeiroNumero + segundoNumero;

        // Operação de subtração
        resultado_Subtracao = segundoNumero - primeiroNumero;

        // Operação de multiplicação
        resultado_Multi = primeiroNumero * 15;

        // Operação de divisão
        resultado_Div = primeiroNumero / segundoNumero;

        // Operador Mod --> Resto da divisão 
        restoDaDivisao = 4 % 10;

        // Operação de incremento

        JOptionPane.showMessageDialog(null, contador, "Incremento", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1; // A variável recebe o valor da variável somado com 1 | Para incremento, tem que ser int ou long
        JOptionPane.showMessageDialog(null, contador, "Incremento 2", JOptionPane.INFORMATION_MESSAGE);
        contador++; // É igual a contador = contador + 1
        JOptionPane.showMessageDialog(null, contador, "Incremento 3", JOptionPane.QUESTION_MESSAGE);
        contador += 2; // Incremento de mais 2 | Pode ser qualquer número depois do = --> *= OU /= OU -=
        JOptionPane.showMessageDialog(null, contador, "Incremento 4", JOptionPane.CLOSED_OPTION); 
        
        // Operação de decremento
        
        JOptionPane.showMessageDialog(null, segundoContador, "Decremento", JOptionPane.DEFAULT_OPTION);
        segundoContador = segundoContador - 1;
        JOptionPane.showMessageDialog(null, segundoContador, "Decremento 2", JOptionPane.ERROR_MESSAGE);
        segundoContador--;
        JOptionPane.showMessageDialog(null, segundoContador, "Decremento 3", JOptionPane.CANCEL_OPTION);

        // Incremendo ou decremento pós e pré-fixado

        contador++; // Incrementa o valor original da variável em 1 depois que ela é usada
        ++contador; // O valor da variável é incrementado em mais 1 antes de ser usado

        contador--;
        --contador;

        // Classe Math --> Realiza diversos cálculos

        int valor01 = -2;
        int valor02 = 4;
        int resultado;

        resultado = Math.abs(valor02); // --> Retorna o valor da variável como positivo
        resultado = (int) Math.pow(10, 3); // Serve para cálculo com expoente --> (base, expoente) | .pow retorna um double, com a variável que recebe tem que ser double ou converter a operação para o tipo de dado que quer
        resultado = (int) Math.sqrt(20); // Calcula a raiz quadrada | também retorna double
        float resultado2 = (float) Math.ceil(20.66); // Arredonda um número com decimal para cima | Retorna double, mas pode forçar o float
        resultado2 = (float) Math.floor(2.5); // Arredonda um número com decimal para baixo
        resultado2 = (float) Math.min(valor01, valor02); // Retorna o menor valor entre duas variáveis
        resultado2 = (float) Math.max(valor02, valor01); // Retorna o maior valor entre duas variáveis

        JOptionPane.showMessageDialog(null, resultado2, "Math", JOptionPane.WARNING_MESSAGE);
        
    }
}
