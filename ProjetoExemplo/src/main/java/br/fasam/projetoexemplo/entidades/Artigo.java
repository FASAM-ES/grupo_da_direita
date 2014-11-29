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
public class Artigo {
    
    String titulo;
    String descricao;
    Usuario usuario;
    List<Comentario> comentarios;
    List<Tag> tag;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public void addComentario(Comentario comentario){
        if(this.comentarios == null){
            this.comentarios = new ArrayList<Comentario>();
        }
        
        this.comentarios.add(comentario);
    }
    
    public void remComentario(Comentario comentario){
        if(this.comentarios != null){
            this.comentarios.remove(comentario);
        }
    }
    
    public void addTag(Tag tag){
        if(this.tag == null){
            this.tag = new ArrayList<Tag>();
        }
        
        this.tag.add(tag);
    }
    
    public void remTag(Tag tag){
        if(this.tag != null){
            this.tag.remove(tag);
        }
    }
}
