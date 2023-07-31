package com.mycompany.bingo.model;

public class Numero {
    
    private int numero;
    private boolean foiSorteado;

    public Numero(int numero) {
        this.numero = numero;
        this.foiSorteado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isFoiSorteado() {
        return foiSorteado;
    }

    public void setFoiSorteado(boolean foiSorteado) {
        this.foiSorteado = foiSorteado;
    }
    
    
    
}
