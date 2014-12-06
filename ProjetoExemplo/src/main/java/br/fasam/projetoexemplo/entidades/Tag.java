package br.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Tag {   
    
    String nome;
    String descricao;
    List<Artigo> artigos;
    
    public Tag(String nome) {
        this.nome = nome;
    }
            
    public Tag(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
            
    /**
     * Obtem artigo na lista de artigos
     * @param i - indice do artigo
     * @return artigo
     */
    public Artigo getArtigo(Integer i) {
        return artigos.get(i);
        
    }
    
    /**
     * Adiciona artigo a lista de artigos
     * @param artigo - artigo a ser adicionado
     */
    public void addArtigo(Artigo artigo){
        if (this.artigos==null){
            this.artigos=new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    /**
     * Remove artigo da lista de artigos
     * @param artigo - artigo a ser removido
     */
    public void remArtigo(Artigo artigo) {
        if (this.artigos !=null) {
            this.artigos.remove(artigo);
        }
    }

    /**
     * Obtem nome da TAG
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atribui nome da TAG
     * @param nome - nome a ser atribuido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtem descrição da TAG
     * @return descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Atribui descrição da TAG
     * @param descricao - descrição a ser atribuida
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
