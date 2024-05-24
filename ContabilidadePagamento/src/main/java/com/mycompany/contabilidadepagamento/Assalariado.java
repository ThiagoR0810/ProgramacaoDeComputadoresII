/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidadepagamento;

/**
 *
 * @author lumascampos
 */
public class Assalariado extends Empregado{
    private double horaExtra;

    public Assalariado(double horaExtra, String nome, String sobrenome, int numeroIdentidade) {
        super(nome, sobrenome, numeroIdentidade);
        this.horaExtra = horaExtra;
    }
    
    

    @Override
    public double getValorAPagar(int dia, int mes) {
        return ControlePagamento.SALARIO + (horaExtra * ControlePagamento.HORA);
    }


}
