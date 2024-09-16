package entidade;

public class Pessoa 
{
    // ATRIBUTOS PRIVATE -> Usar para evitar que o usuário altere diretamente os valores, use os métodos
    
    private String nome = "Lucy";    
    private int idade = 15;
    private float altura;
    
    public String pegarNome() 
    {
        return nome;
    }
    
    /* THIS -> Serve para quando deseja atribuir valor 
                a um atributo com o mesmo nome do parâmetro */
    
    public void alterarNome(String nome) 
    {
        this.nome = nome;
    }
    
    public int pegarIdade() 
    {
        return idade;
    }
    
    public void alterarIdade(int idade) 
    {
        this.idade = idade;
    }
    
    // Método Correto - GET e SET
    
    // GET -> Serve para pegar um Dado | Método com retorno
    // GET = PEGAR
    // SINTAXE -> <modificador-acesso> <tipoRetorno> getNomeAtributo
    
    public float getAltura() 
    {
        return altura;
    }
    
    // SET -> Serve para modificar/alterar um Dado | Método void
    // SET = MODIFICAR
    // SINTAXE -> <modificador-acesso> void setNomeAtributo
    
    public void setAltura(float altura) 
    {
        this.altura = altura;
    }
}
