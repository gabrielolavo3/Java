
package entidade;

public class AlunoBolsista 
{
    private String nome;
    private String matricula;
    private float primeiraNota;
    private float segundaNota;
    private int bonusBolsista;
    
    public AlunoBolsista(String nome, String matricula, float primeiraNota, float segundaNota)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        bonusBolsista = 10;
    }
    
    public float calcularMedia()
    {
        float media = (primeiraNota + segundaNota) / 2;
              media = media + ((media * bonusBolsista) / 100);
        return media;
    }
    
}
