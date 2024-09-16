package br.com.pegaralterar.getsetdados;

import entidade.Pessoa;

public class GetSetDados {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
                
        pessoa.alterarNome("Owen");
        pessoa.alterarIdade(20);
        pessoa.setAltura(1.70F);
        
        System.out.println(pessoa.pegarNome());
        System.out.println(pessoa.pegarIdade());
        System.out.println(pessoa.getAltura());
    }
}
