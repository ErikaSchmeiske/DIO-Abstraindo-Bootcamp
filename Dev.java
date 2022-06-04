/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiopoojava;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 *
 * @author Erika
 */
public class Dev {
    private String nome;
    private Set<conteudo> conteudosInscricao = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscricao.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
};
    public void progredir(){
        Optional<conteudo> conteudo = this.conteudosInscricao.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscricao.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
        
};
    public double calcularTotalXP(){   
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscricao() {
        return conteudosInscricao;
    }

    public void setConteudosInscricao(Set<conteudo> conteudosInscricao) {
        this.conteudosInscricao = conteudosInscricao;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.conteudosInscricao);
        hash = 29 * hash + Objects.hashCode(this.conteudosConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudosInscricao, other.conteudosInscricao)) {
            return false;
        }
        return Objects.equals(this.conteudosConcluidos, other.conteudosConcluidos);
    }
    
    
}
    
