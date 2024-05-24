/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidadepagamento;


public abstract class Empregado extends Pagavel{
    protected String nome;
    protected String sobrenome;
    protected int numeroIdentidade;

    public Empregado(String nome, String sobrenome, int numeroIdentidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroIdentidade = numeroIdentidade;
    }
    
    
    
}
