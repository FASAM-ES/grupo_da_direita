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
public class Usuario {
    String nome;
    String email;
    String senha;
    String telefone;
    String cpf;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }
}
