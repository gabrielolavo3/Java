/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author aluno.den
 */
public class VeiculoDTO 
{
    private int idVeiculo;
    private String cor;
    private String modelo;
    private String placa;
    private String dataHoraEntrada;
    private String dataHoraSaida;
    private String porte;

    /*
    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the dataHoraEntrada
     */
    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    /**
     * @param dataHoraEntrada the dataHoraEntrada to set
     */
    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    /**
     * @return the dataHoraSaida
     */
    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    /**
     * @param dataHoraSaida the dataHoraSaida to set
     */
    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    /**
     * @return the porte
     */
    public String getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    
}
