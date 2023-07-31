package com.mycompany.bingo.model;

import com.mycompany.bingo.view.Cartela;
import com.mycompany.bingo.view.FimDoJogo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Computador implements Observer{
    
    public ArrayList<Numero> listaNumeros = new ArrayList<>();
    Cartela cartela;

    public Computador() {
    }

    @Override
    public void update(int numeroSorteado, JPanel pane) {
        cartela = (Cartela) pane;
        //muda a cor das label que contem o numero que foi sorteado
        for (JLabel label : cartela.getListaLabel()) {
            if (label.getText().equals(Integer.toString(numeroSorteado))) {
                label.setBackground(Color.BLACK);
                label.setForeground(Color.WHITE);
            }
        }
        //marca que o numero foi sorteado
        for (Numero numero : cartela.getListaComputador()) {
            if (numero.getNumero() == numeroSorteado) {
                numero.setFoiSorteado(true);
            }
        }
        conferirBingo(cartela);
    }
    
    public void conferirBingo(JPanel pane){
        //confere se o computador ganhou o bingo
        boolean confere = true;
        for (Numero numero : cartela.getListaComputador()) {
            if (!numero.isFoiSorteado()) {
                confere = false;
            }
        }
        if (confere) {
            //abre o painel de game over
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(cartela);
            janela.getContentPane().removeAll();
            FimDoJogo p3 = new FimDoJogo(false);
            janela.add(p3, BorderLayout.CENTER);
            janela.pack();
            janela.setLocationRelativeTo(null);
        }
    }
    
}
