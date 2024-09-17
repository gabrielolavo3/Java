package Conta;

public class ContaPF {
    private float saldo;
    private String numeroConta;
    
    public ContaPF() 
    {
        saldo = 2000F;
        numeroConta = "X0102GT";
    }
    
    public float depositarValor(float deposito)
    {
        if (deposito > 0) {
           return saldo += deposito;        
        
        } else {
            saldo = saldo;
        }
                
        return saldo;
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public String toString()
    {
        return String.format("Conta bancária %s\nSaldo atual - R$ %.2f", numeroConta, saldo);
    }
}
