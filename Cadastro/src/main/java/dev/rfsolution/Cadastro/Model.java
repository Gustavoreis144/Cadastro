package dev.rfsolution.Cadastro;

import jakarta.persistence.*;

//Entity ele transforma a classe em entidade no BD
@Entity
@Table (name = "tb_usuario")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;
    String nome;
    String email;
    int    idade;


    public Model(){

    }

   public Model(String nome, String email, int idade){

   }

   public String getNome(){
      return nome;
   }

   public void setNome(){
        this.nome = nome;
   }

   public String getEmail(){
        return email;
   }

   public void setEmail(){
        this.email = email;
   }

   public int getIdade(){
        return idade;
   }

   public void setIdade(){
        this.idade = idade;
   }

}
