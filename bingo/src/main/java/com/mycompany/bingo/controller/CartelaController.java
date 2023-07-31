package com.mycompany.bingo.controller;

import com.mycompany.bingo.model.Numero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JLabel;

public class CartelaController {
    
    public CartelaController() {
        
    }
    
    //sorteia os numeros para colocar nas cartelas
    private ArrayList<Integer> sortearNumerosCartela(){
        ArrayList<Integer> numeros = new ArrayList<>();
        int quantidadeNumeros = 24;
        int valorMaximo = 75;
        
        Random random = new Random();
        
        int i = 0;
        while(i < quantidadeNumeros){
            int numeroSorteado = random.nextInt(valorMaximo)+1;
            if (!numeros.contains(numeroSorteado)) {
                numeros.add(numeroSorteado);
                i++;
            }
        }
        Collections.sort(numeros);
        return numeros;
    }
    
    //adiciona os numeros sorteados na cartela
    public ArrayList<Numero> adicionarNumerosCartela(ArrayList<JLabel> cartelaLabels){
        ArrayList<Integer> numeros = sortearNumerosCartela();
        ArrayList<Numero> listaNumeros = new ArrayList<>();
        
        for (int i = 0; i < 24; i++) {
            cartelaLabels.get(i).setText(Integer.toString(numeros.get(i)));
            listaNumeros.add(new Numero(numeros.get(i)));
        }
        
        return listaNumeros;
    }
    
}
