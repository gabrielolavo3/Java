package br.com.conta.contasimples;

import Conta.ContaPF;
import java.util.Scanner;

public class ContaSimples {

    public static void main(String[] args) {
        
        char realizarDeposito;
        float valor = 0f;
        
        ContaPF conta = new ContaPF();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Deseja realizar deposito (Y/N)? ");
        realizarDeposito = scan.next().charAt(0);
        
        if (realizarDeposito == 'Y' || realizarDeposito == 'y') {
            System.out.print("Insira o valor do deposito: ");
            valor = scan.nextFloat();
            
            conta.depositarValor(valor);
            System.out.println(conta.toString());
        
        } else {
            conta.depositarValor(valor);
            System.out.println(conta.toString());
        }
    }
}
