/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidadepagamento;

/**
 *
 * @author lumascampos
 */
public class Bola {
    private int raio;
    private String cor;
    public static double aceleracaoGravidade = 9.8;
    
    public Bola(int raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }
    
    public double calculaArea(){
        return 4* Math.PI * Math.pow(raio,2);
    }
    
    public static void calculaAceleracao(int raio){
        System.out.println(raio*aceleracaoGravidade);
    }
    
}
