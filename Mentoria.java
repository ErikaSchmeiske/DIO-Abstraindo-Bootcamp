/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoojava;

import java.time.LocalDate;

/**
 *
 * @author Erika-Engest
 */
public class Mentoria extends conteudo {
        
    private LocalDate data;
   
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    
    public Mentoria(){
    
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + 
                "titulo=" + getTitulo() + 
                ", descricao=" + getDescricao() + 
                ", data=" + data + '}';
    }

    
    
    
    
}
