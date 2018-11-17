/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author myllah
 */
public class Cliente {
    
    private String nome;
    private String senha;
    
    Cliente(){}
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public String getNome(){
        return nome;        
    }
    
    public void setSenha(String senha){
      this.senha = senha; 
    }
    
    public String getSenha(){
        return senha;
    }
    
}
