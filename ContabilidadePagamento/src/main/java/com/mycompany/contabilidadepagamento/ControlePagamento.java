/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidadepagamento;

/**
 *
 * @author lumascampos
 */
public class ControlePagamento {
    public static final double SALARIO = 1212.0;
    public static final double HORA = 30.0;
    private Pagavel[] controlePagamento;
    private int posicao;
    
    public ControlePagamento(){
        this.controlePagamento = new Pagavel[10];
        this.posicao = 0;
    }
 
    public void adicionaItemPagavel(Pagavel item){
        if(posicao<10){
            controlePagamento[posicao] = item;
            posicao++;
        }
    }
    
    public double calculaValorAPagarContas(int dia, int mes){
        double retorno = 0;
        
        for(Pagavel item : controlePagamento){
            if (item instanceof Conta){
                retorno = retorno + item.getValorAPagar(dia, mes);
            }
        }
        return retorno;
    }
}
