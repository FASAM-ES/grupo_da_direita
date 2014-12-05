package br.fasam.projetoexemplo.entidades;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class Categoria {
    private String nome;
    private String descricao;
    private List<Artigo> artigos;

    public Categoria(String nome){
        this.nome = nome;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the artigos
     */
    public List<Artigo> getArtigos() {
        return artigos;
    }

    /**
     * @param artigos the artigos to set
     */
    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }
}
