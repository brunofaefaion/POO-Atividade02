package com.bruno.ac1.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    private int registro;
    private String nome;
    private String setor;
    private String cargo;
    private float salario;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", registro=" + registro + ", salario=" + salario
                + ", setor=" + setor + "]";
    }
    
    
    

}