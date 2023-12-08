/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Aluno_Manha
 */
public class Carro {
    
    private String modelo;
    private String potencia;
    private String ano;
    private String precoaluguel;
    private String precocompra;
    
    public Carro(){
        
    }
    
    public Carro(String modelo, String potencia, String ano, String precoaluguel, String precocompra){
        this.modelo = modelo;
        this.potencia = potencia;
        this.ano = ano;
        this.precoaluguel = precoaluguel;
        this.precocompra = precocompra;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPrecoaluguel() {
        return precoaluguel;
    }

    public void setPrecoaluguel(String precoaluguel) {
        this.precoaluguel = precoaluguel;
    }

    public String getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(String precocompra) {
        this.precocompra = precocompra;
    }
    
    
}
