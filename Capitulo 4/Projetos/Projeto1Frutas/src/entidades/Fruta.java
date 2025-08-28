/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author João Pedro Machado
 */
public class Fruta {
    private int id;
    private String nome;
    private String cor_predominante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor_predominante() {
        return cor_predominante;
    }

    public void setCor_predominante(String cor_predominante) {
        this.cor_predominante = cor_predominante;
    }
    
    @Override
    public String toString() {
        return "Fruta{" + "id=" + id + ", nome=" + nome + ", cor_predominante=" + cor_predominante + '}';
    }
}
