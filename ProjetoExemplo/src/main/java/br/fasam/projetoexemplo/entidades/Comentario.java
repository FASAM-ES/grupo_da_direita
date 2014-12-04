/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fasam.projetoexemplo.entidades;

/**
 *
 * @author Aurélio
 */
public class Comentario {
    String titulo;
    String descricao;
    Usuario usuario;
    Artigo artigo;

    public Comentario (String titulo, Usuario usuario){
        this.titulo = titulo;
        this.usuario = usuario;
    }
    
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

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
    
    
}
