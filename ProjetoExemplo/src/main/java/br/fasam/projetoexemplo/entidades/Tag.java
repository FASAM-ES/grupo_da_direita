/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Tag {   
    
    String nome;
    String descricao;
    List<Artigo> artigos;
    
    public Artigo getArtigo(Integer i) {
        return artigos.get(i);
        
    }
    
    public void addArtigo(Artigo artigo){
        if (this.artigos==null)
        {
            this.artigos=new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void remArtigo(Artigo artigo)
    {
        if (this.artigos !=null) {
            this.artigos.remove(artigo);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }
    
}
