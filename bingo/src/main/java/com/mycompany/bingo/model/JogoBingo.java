package com.mycompany.bingo.model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JogoBingo {
    
    private ArrayList<Observer> observers = new ArrayList<>();

    public JogoBingo() {
    }

       
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
        
    
    public void notificaObservers(int number, JPanel pane) {
        for (Observer observer : observers) {
            observer.update(number, pane);
        }
    }
    
}
