package br.fasam.projetoexemplo.entidades;

import java.util.List;

public class Categoria {
    private String nome;
    private String descricao;
    private List<Artigo> artigos;

    public Categoria(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }
}
