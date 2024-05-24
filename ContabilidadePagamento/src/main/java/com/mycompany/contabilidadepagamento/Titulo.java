
package com.mycompany.contabilidadepagamento;


public class Titulo extends Conta {
    
    public Titulo(int dia, int mes, double valor){
        super(dia, mes, valor);
    }

    
    public double getValorAPagar(int diaPagto, int mesPagto) {
        if (diaPagto > this.dia){
            return (this.valor *1.1);
        }
        return this.valor;
    }
    
}
