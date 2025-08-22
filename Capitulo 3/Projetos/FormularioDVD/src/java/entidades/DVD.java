/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author João Pedro Machado
 */
public class DVD {
    private int numero;
    private String titulo;
    private String aPrincipal;
    private String aCoadjuvante;
    private String diretor;
    private int anoLancamento;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getaPrincipal() {
        return aPrincipal;
    }

    public void setaPrincipal(String aPrincipal) {
        this.aPrincipal = aPrincipal;
    }

    public String getaCoadjuvante() {
        return aCoadjuvante;
    }

    public void setaCoadjuvante(String aCoadjuvante) {
        this.aCoadjuvante = aCoadjuvante;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
}
