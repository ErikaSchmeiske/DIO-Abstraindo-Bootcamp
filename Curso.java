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
public class Curso extends conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + 
                "titulo=" + getTitulo() + 
                ", descricao=" + getDescricao() + 
                ", cargaHoraria=" + cargaHoraria + '}';
    }
}

   
    
    

