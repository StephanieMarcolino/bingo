package com.mycompany.bingo.model;

import javax.swing.JPanel;


public interface Observer {
    void update(int number, JPanel pane);
}
