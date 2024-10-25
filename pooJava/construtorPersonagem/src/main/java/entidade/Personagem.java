package entidade;

import javax.swing.JOptionPane;

public class Personagem 
{
    // Declaração de Atributos
    
    private String nome;
    private String classe;
    private int nivel;
    private int forca;
    private int vida;
    
    /* Método Construtor -> 1º a ser chamado no Main, de forma automatica quando a Class é instânciada e o arquivo executado
    Serve para inicializar atributos, chamar métodos da Class,  pode ter ou não parâmetros  */
    // SINTAXE -> <moficador> <nomeDaClasse>
    
    public Personagem (String nome, String classe) 
    {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        
        if (classe.equals("Arqueiro")) 
        {
            forca = nivel * 3;
        } 
        else 
        {
            forca = nivel;
        }
    }
    
    // Métodos Comuns
    
    public void mostrarStatus() 
    {
        String status = String.format("Nome: %s\nNivel: %d\nVida: %d\nClasse: %s\nForça: %d",
            nome, 
            nivel, 
            vida, 
            classe, 
            forca);
        
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Métodos Getters e Setters
    
    public String getNome() 
    {
        return nome;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public int getNivel() 
    {
        return nivel;
    }
    
    public void setNivel(int nivel) 
    {
        this.nivel = nivel;
    }
    
    public int getForca() 
    {
        return forca;
    }
    
    public void setForca(int forca) 
    {
        this.forca = forca;
    }
    
    public int getVida() 
    {
        return vida;
    }
    
    public void setVida(int vida) 
    {
        this.vida = vida;
    }
    
    public String getClasse() 
    {
        return classe;
    }
    
    public void setClasse(String classe) 
    {
        this.classe = classe;
    }
}