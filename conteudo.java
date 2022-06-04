/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoojava;

/**
 *
 * @author Erika-Engest
 */
public abstract class conteudo {
    protected static final double XP_PADRAO = 10;
    
    private String titulo;
    private String descricao;
    
    public abstract double calcularXP(); 

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
