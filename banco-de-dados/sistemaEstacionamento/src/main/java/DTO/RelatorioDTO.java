/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author aluno.den
 */
public class RelatorioDTO 
{
    private int idRelatorio;
    private int FKpagamento;
    private String FKveiculo;
    private int FKvaga;

    /**
     * @return the idRelatorio
     */
    public int getIdRelatorio() {
        return idRelatorio;
    }

    /**
     * @param idRelatorio the idRelatorio to set
     */
    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    /**
     * @return the FKpagamento
     */
    public int getFKpagamento() {
        return FKpagamento;
    }

    /**
     * @param FKpagamento the FKpagamento to set
     */
    public void setFKpagamento(int FKpagamento) {
        this.FKpagamento = FKpagamento;
    }

    /**
     * @return the FKveiculo
     */
    public String getFKveiculo() {
        return FKveiculo;
    }

    /**
     * @param FKveiculo the FKveiculo to set
     */
    public void setFKveiculo(String FKveiculo) {
        this.FKveiculo = FKveiculo;
    }

    /**
     * @return the FKvaga
     */
    public int getFKvaga() {
        return FKvaga;
    }

    /**
     * @param FKvaga the FKvaga to set
     */
    public void setFKvaga(int FKvaga) {
        this.FKvaga = FKvaga;
    }
    
    
}
