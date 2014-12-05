package br.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    String email;
    String senha;
    String telefone;
    String cpf;
    List<Artigo> artigos;
    
    public Usuario(String nome,String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Artigo getArtigo(Integer i) {
        return artigos.get(i);
    }
    
    public void addArtigo(Artigo artigo) {
        if (this.artigos==null) {
            this.artigos=new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    public void remArtigo(Artigo artigo){
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}
