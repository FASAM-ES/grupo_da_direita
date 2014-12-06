package br.fasam.projetoexemplo.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa Usuario
 * @author Raphael
 */
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
    
    /**
     * Obtem artigo na lista de artigos
     * @param i - indice do artigo
     * @return artigo
     */
    public Artigo getArtigo(Integer i) {
        return artigos.get(i);
    }
    
    public void addArtigo(Artigo artigo) {
        if (this.artigos==null) {
            this.artigos=new ArrayList<Artigo>();
        }
        this.artigos.add(artigo);
    }
    
    /**
     * Remove artigo da lista de artigos
     * @param artigo - artigo a ser removido
     */
    public void remArtigo(Artigo artigo){
        if (this.artigos !=null) {
            this.artigos.remove(artigo);
        }
    }
    
    /**
     * Obtem nome do usuario
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atribui nome do usuario
     * @param nome - nome a ser atriibuido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtem email do usuario
     * @return - email do usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Atribui email do usuario
     * @param email - email a ser atribuido
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtem senha do usuario
     * @return senha do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Atribui senha do usuario
     * @param senha - senha a ser atribuida
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtem telefone do usuario
     * @return telefone do usuario
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Atribui telefone do usuario
     * @param telefone - telefone a ser atribuido
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtem CPF do usuario
     * @return CPF do usuario
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Atribui CPF do usuario
     * @param cpf - CPF a ser atribuido
     */
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}
