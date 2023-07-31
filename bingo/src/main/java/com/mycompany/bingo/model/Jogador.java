package com.mycompany.bingo.model;

import com.mycompany.bingo.view.Cartela;
import javax.swing.JPanel;

public class Jogador implements Observer {
    
    Cartela cartela;

    public Jogador() {
    }
    
    @Override
    public void update(int numeroSorteado, JPanel pane) {
        cartela = (Cartela) pane;
        //marca que o numero foi sorteado
        for (Numero listaNumero : cartela.getListaJogador()) {
            if (listaNumero.getNumero()==numeroSorteado) {
                listaNumero.setFoiSorteado(true);
            }
        }
    }
    
}
