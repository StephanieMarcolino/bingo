package com.mycompany.bingo.view;

import com.mycompany.bingo.model.Computador;
import com.mycompany.bingo.model.Jogador;
import com.mycompany.bingo.model.JogoBingo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author stephanie.pm
 */
public class Inicio extends javax.swing.JPanel {

    JogoBingo bingo = new JogoBingo();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();
    ArrayList<Integer> numeros = new ArrayList<>();
    int numeroAleatorio = 0;
    int cont = 0;
    
    public Inicio() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("jLabel1");
        ImageIcon imageIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/bingo.png")).getImage());
        jLabel1.setIcon(imageIcon);

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        imageIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/fechar.png")).getImage());
        jLabel3.setIcon(imageIcon);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        imageIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/PLAY.png")).getImage());
        jLabel2.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        //sai da aplicação
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        //adiciona o jogador e computador na lista de observadores
        bingo.addObserver(jogador);
        bingo.addObserver(computador);
        Cartela p2 = new Cartela();
        Timer timer = new Timer();
        
        TimerTask sorteioTask = new TimerTask() {
            @Override
            public void run() {
                numeroAleatorio = sortearNumero();
                numeros.add(numeroAleatorio);
                bingo.notificaObservers(numeroAleatorio, p2);
                p2.getLabel().setText(Integer.toString(numeroAleatorio));
                cont++;
                if (cont<14) {
                    p2.getJTextArea().append(Integer.toString(numeroAleatorio) + " - ");
                }
                if (cont==14) {
                    p2.getJTextArea().append("\n"+Integer.toString(numeroAleatorio) + " - ");
                    cont = 0;
                }
            }
        };
        // Inicia o sorteio a cada 3 segundos
        timer.schedule(sorteioTask, 0, 3000);
        
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(p2, BorderLayout.CENTER);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel2MousePressed


    public int sortearNumero(){
        //sortea aleatoriamente um numero
        Random random = new Random();
        //se o numero sorteado ja tiver sido sorteado antes ele escolhe outro
        do{
            numeroAleatorio = random.nextInt(75)+1;
        }while (numeros.contains(numeroAleatorio));
        return numeroAleatorio;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
