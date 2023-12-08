/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


/**
 *
 * @author Aluno_Manha
 */
public class Cliente {
    
    private String nome;
    private String cnh;
    private String tipocnh;
    private String idade;
    private String email;
    private String senha;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String cnh, String tipocnh, String idade, String email,String senha){
        this.nome = nome;
        this.cnh = cnh;
        this.tipocnh = tipocnh;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTipocnh() {
        return tipocnh;
    }

    public void setTipocnh(String tipocnh) {
        this.tipocnh = tipocnh;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
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
    
}
