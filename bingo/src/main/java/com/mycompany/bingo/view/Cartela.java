package com.mycompany.bingo.view;

import com.mycompany.bingo.controller.CartelaController;
import com.mycompany.bingo.model.Jogador;
import com.mycompany.bingo.model.JogoBingo;
import com.mycompany.bingo.model.Numero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Cartela extends javax.swing.JPanel {

    ArrayList<JLabel> listaJogador = new ArrayList<>();
    ArrayList<JLabel> listaComputador = new ArrayList<>();
    ArrayList<Numero> numerosJogador = new ArrayList<>();
    ArrayList<Numero> numerosComputador = new ArrayList<>();
    CartelaController controller = new CartelaController();
    
    
    public Cartela() {
        initComponents();
        
        
        listaComputador = criarListaComputador();
        listaJogador = criarListaJogador();
        numerosJogador = controller.adicionarNumerosCartela(listaJogador);
        numerosComputador = controller.adicionarNumerosCartela(listaComputador);
    }
    
    //cria uma lista contendo as labels da cartela do computador
    public ArrayList<JLabel> criarListaComputador() {
        ArrayList<JLabel> lista = new ArrayList<>();    
            for (int i = 1; i <= 24; i++) {
                try {
                    JLabel label = (JLabel) getClass().getDeclaredField("lbComputadorNumero" + i).get(this);
                    lista.add(label);
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        return lista;
    }
    
    //cria uma lista contendo as labels da cartela do jogador
    public ArrayList<JLabel> criarListaJogador(){
        ArrayList<JLabel> lista = new ArrayList<>();
            for (int i = 1; i <= 24; i++) {
                try {
                    JLabel label = (JLabel) getClass().getDeclaredField("lbJogadorNumero" + i).get(this);
                    lista.add(label);
                } catch (NoSuchFieldException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SecurityException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                }catch (IllegalAccessException ex) {
                    Logger.getLogger(Cartela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return lista;
    }

    //mudar a cor da label quando o jogador clica nela
    public void mudarCor(JLabel label){
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbJogadorNumero1 = new javax.swing.JLabel();
        lbJogadorNumero2 = new javax.swing.JLabel();
        lbJogadorNumero3 = new javax.swing.JLabel();
        lbJogadorNumero4 = new javax.swing.JLabel();
        lbJogadorNumero5 = new javax.swing.JLabel();
        lbJogadorNumero6 = new javax.swing.JLabel();
        lbJogadorNumero7 = new javax.swing.JLabel();
        lbJogadorNumero8 = new javax.swing.JLabel();
        lbJogadorNumero9 = new javax.swing.JLabel();
        lbJogadorNumero10 = new javax.swing.JLabel();
        lbJogadorNumero11 = new javax.swing.JLabel();
        lbJogadorNumero12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbJogadorNumero13 = new javax.swing.JLabel();
        lbJogadorNumero14 = new javax.swing.JLabel();
        lbJogadorNumero15 = new javax.swing.JLabel();
        lbJogadorNumero16 = new javax.swing.JLabel();
        lbJogadorNumero17 = new javax.swing.JLabel();
        lbJogadorNumero18 = new javax.swing.JLabel();
        lbJogadorNumero19 = new javax.swing.JLabel();
        lbJogadorNumero20 = new javax.swing.JLabel();
        lbJogadorNumero21 = new javax.swing.JLabel();
        lbJogadorNumero22 = new javax.swing.JLabel();
        lbJogadorNumero23 = new javax.swing.JLabel();
        lbJogadorNumero24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbComputadorNumero5 = new javax.swing.JLabel();
        lbComputadorNumero10 = new javax.swing.JLabel();
        lbComputadorNumero14 = new javax.swing.JLabel();
        lbComputadorNumero19 = new javax.swing.JLabel();
        lbComputadorNumero24 = new javax.swing.JLabel();
        lbComputadorNumero23 = new javax.swing.JLabel();
        lbComputadorNumero18 = new javax.swing.JLabel();
        lbComputadorNumero22 = new javax.swing.JLabel();
        lbComputadorNumero17 = new javax.swing.JLabel();
        lbComputadorNumero16 = new javax.swing.JLabel();
        lbComputadorNumero21 = new javax.swing.JLabel();
        lbComputadorNumero20 = new javax.swing.JLabel();
        lbComputadorNumero15 = new javax.swing.JLabel();
        lbComputadorNumero11 = new javax.swing.JLabel();
        lbComputadorNumero6 = new javax.swing.JLabel();
        lbComputadorNumero1 = new javax.swing.JLabel();
        lbComputadorNumero2 = new javax.swing.JLabel();
        lbComputadorNumero7 = new javax.swing.JLabel();
        lbComputadorNumero12 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lbComputadorNumero13 = new javax.swing.JLabel();
        lbComputadorNumero9 = new javax.swing.JLabel();
        lbComputadorNumero8 = new javax.swing.JLabel();
        lbComputadorNumero3 = new javax.swing.JLabel();
        lbComputadorNumero4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lbNumeroSorteado = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("jLabel3");
        ImageIcon image = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/fechar.png")).getImage());
        jLabel3.setIcon(image);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("B");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("G");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("O");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("I");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);

        lbJogadorNumero1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero1.setText("1");
        lbJogadorNumero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero1.setOpaque(true);
        lbJogadorNumero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero1MouseClicked(evt);
            }
        });

        lbJogadorNumero2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero2.setText("2");
        lbJogadorNumero2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero2.setOpaque(true);
        lbJogadorNumero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero2MouseClicked(evt);
            }
        });

        lbJogadorNumero3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero3.setText("3");
        lbJogadorNumero3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero3.setOpaque(true);
        lbJogadorNumero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero3MouseClicked(evt);
            }
        });

        lbJogadorNumero4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero4.setText("4");
        lbJogadorNumero4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero4.setOpaque(true);
        lbJogadorNumero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero4MouseClicked(evt);
            }
        });

        lbJogadorNumero5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero5.setText("5");
        lbJogadorNumero5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero5.setOpaque(true);
        lbJogadorNumero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero5MouseClicked(evt);
            }
        });

        lbJogadorNumero6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero6.setText("6");
        lbJogadorNumero6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero6.setOpaque(true);
        lbJogadorNumero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero6MouseClicked(evt);
            }
        });

        lbJogadorNumero7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero7.setText("7");
        lbJogadorNumero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero7.setOpaque(true);
        lbJogadorNumero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero7MouseClicked(evt);
            }
        });

        lbJogadorNumero8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero8.setText("8");
        lbJogadorNumero8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero8.setOpaque(true);
        lbJogadorNumero8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero8MouseClicked(evt);
            }
        });

        lbJogadorNumero9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero9.setText("9");
        lbJogadorNumero9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero9.setOpaque(true);
        lbJogadorNumero9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero9MouseClicked(evt);
            }
        });

        lbJogadorNumero10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero10.setText("10");
        lbJogadorNumero10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero10.setOpaque(true);
        lbJogadorNumero10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero10MouseClicked(evt);
            }
        });

        lbJogadorNumero11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero11.setText("11");
        lbJogadorNumero11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero11.setOpaque(true);
        lbJogadorNumero11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero11MouseClicked(evt);
            }
        });

        lbJogadorNumero12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero12.setText("12");
        lbJogadorNumero12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero12.setOpaque(true);
        lbJogadorNumero12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero12MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        ImageIcon imageIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/BINGO!.png")).getImage());
        jLabel19.setIcon(imageIcon);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        lbJogadorNumero13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero13.setText("13");
        lbJogadorNumero13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero13.setOpaque(true);
        lbJogadorNumero13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero13MouseClicked(evt);
            }
        });

        lbJogadorNumero14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero14.setText("14");
        lbJogadorNumero14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero14.setOpaque(true);
        lbJogadorNumero14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero14MouseClicked(evt);
            }
        });

        lbJogadorNumero15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero15.setText("15");
        lbJogadorNumero15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero15.setOpaque(true);
        lbJogadorNumero15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero15MouseClicked(evt);
            }
        });

        lbJogadorNumero16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero16.setText("16");
        lbJogadorNumero16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero16.setOpaque(true);
        lbJogadorNumero16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero16MouseClicked(evt);
            }
        });

        lbJogadorNumero17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero17.setText("17");
        lbJogadorNumero17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero17.setOpaque(true);
        lbJogadorNumero17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero17MouseClicked(evt);
            }
        });

        lbJogadorNumero18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero18.setText("18");
        lbJogadorNumero18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero18.setOpaque(true);
        lbJogadorNumero18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero18MouseClicked(evt);
            }
        });

        lbJogadorNumero19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero19.setText("19");
        lbJogadorNumero19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero19.setOpaque(true);
        lbJogadorNumero19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero19MouseClicked(evt);
            }
        });

        lbJogadorNumero20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero20.setText("20");
        lbJogadorNumero20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero20.setOpaque(true);
        lbJogadorNumero20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero20MouseClicked(evt);
            }
        });

        lbJogadorNumero21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero21.setText("21");
        lbJogadorNumero21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero21.setOpaque(true);
        lbJogadorNumero21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero21MouseClicked(evt);
            }
        });

        lbJogadorNumero22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero22.setText("22");
        lbJogadorNumero22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero22.setOpaque(true);
        lbJogadorNumero22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero22MouseClicked(evt);
            }
        });

        lbJogadorNumero23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero23.setText("23");
        lbJogadorNumero23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero23.setOpaque(true);
        lbJogadorNumero23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero23MouseClicked(evt);
            }
        });

        lbJogadorNumero24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbJogadorNumero24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero24.setText("24");
        lbJogadorNumero24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbJogadorNumero24.setOpaque(true);
        lbJogadorNumero24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbJogadorNumero24MouseClicked(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 204, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("B");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 204, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("I");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("N");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("G");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setOpaque(true);

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 204, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("O");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setOpaque(true);

        lbComputadorNumero5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero5.setText("5");
        lbComputadorNumero5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero5.setOpaque(true);

        lbComputadorNumero10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero10.setText("10");
        lbComputadorNumero10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero10.setOpaque(true);

        lbComputadorNumero14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero14.setText("14");
        lbComputadorNumero14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero14.setOpaque(true);

        lbComputadorNumero19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero19.setText("19");
        lbComputadorNumero19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero19.setOpaque(true);

        lbComputadorNumero24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero24.setText("24");
        lbComputadorNumero24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero24.setOpaque(true);

        lbComputadorNumero23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero23.setText("23");
        lbComputadorNumero23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero23.setOpaque(true);

        lbComputadorNumero18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero18.setText("18");
        lbComputadorNumero18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero18.setOpaque(true);

        lbComputadorNumero22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero22.setText("22");
        lbComputadorNumero22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero22.setOpaque(true);

        lbComputadorNumero17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero17.setText("17");
        lbComputadorNumero17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero17.setOpaque(true);

        lbComputadorNumero16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero16.setText("16");
        lbComputadorNumero16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero16.setOpaque(true);

        lbComputadorNumero21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero21.setText("21");
        lbComputadorNumero21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero21.setOpaque(true);

        lbComputadorNumero20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero20.setText("20");
        lbComputadorNumero20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero20.setOpaque(true);

        lbComputadorNumero15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero15.setText("15");
        lbComputadorNumero15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero15.setOpaque(true);

        lbComputadorNumero11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero11.setText("11");
        lbComputadorNumero11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero11.setOpaque(true);

        lbComputadorNumero6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero6.setText("6");
        lbComputadorNumero6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero6.setOpaque(true);

        lbComputadorNumero1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero1.setText("1");
        lbComputadorNumero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero1.setOpaque(true);

        lbComputadorNumero2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero2.setText("2");
        lbComputadorNumero2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero2.setOpaque(true);

        lbComputadorNumero7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero7.setText("7");
        lbComputadorNumero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero7.setOpaque(true);

        lbComputadorNumero12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero12.setText("12");
        lbComputadorNumero12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero12.setOpaque(true);

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel56.setOpaque(true);
        //ImageIcon imageIcon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/BINGO!.png")).getImage());
        jLabel56.setIcon(imageIcon);

        lbComputadorNumero13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero13.setText("13");
        lbComputadorNumero13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero13.setOpaque(true);

        lbComputadorNumero9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero9.setText("9");
        lbComputadorNumero9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero9.setOpaque(true);

        lbComputadorNumero8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero8.setText("8");
        lbComputadorNumero8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero8.setOpaque(true);

        lbComputadorNumero3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero3.setText("3");
        lbComputadorNumero3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero3.setOpaque(true);

        lbComputadorNumero4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbComputadorNumero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero4.setText("4");
        lbComputadorNumero4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbComputadorNumero4.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("COMPUTADOR");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("VOCÊ");

        lbNumeroSorteado.setBackground(new java.awt.Color(255, 255, 255));
        lbNumeroSorteado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbNumeroSorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNumeroSorteado.setText("1");
        lbNumeroSorteado.setOpaque(true);

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Número sorteado:");

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbJogadorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbJogadorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbJogadorNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbJogadorNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbJogadorNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbJogadorNumero24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbComputadorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbComputadorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbComputadorNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbComputadorNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbComputadorNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbComputadorNumero24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel62)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel65)
                                    .addComponent(lbNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroSorteado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJogadorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJogadorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJogadorNumero18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJogadorNumero24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJogadorNumero19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComputadorNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComputadorNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComputadorNumero18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComputadorNumero24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbComputadorNumero19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        //sai da aplicação
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed

    private void lbJogadorNumero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero1MouseClicked
        mudarCor(lbJogadorNumero1);
    }//GEN-LAST:event_lbJogadorNumero1MouseClicked

    private void lbJogadorNumero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero6MouseClicked
        mudarCor(lbJogadorNumero6);
    }//GEN-LAST:event_lbJogadorNumero6MouseClicked

    private void lbJogadorNumero11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero11MouseClicked
        mudarCor(lbJogadorNumero11);
    }//GEN-LAST:event_lbJogadorNumero11MouseClicked

    private void lbJogadorNumero15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero15MouseClicked
        mudarCor(lbJogadorNumero15);
    }//GEN-LAST:event_lbJogadorNumero15MouseClicked

    private void lbJogadorNumero20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero20MouseClicked
        mudarCor(lbJogadorNumero20);
    }//GEN-LAST:event_lbJogadorNumero20MouseClicked

    private void lbJogadorNumero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero2MouseClicked
        mudarCor(lbJogadorNumero2);
    }//GEN-LAST:event_lbJogadorNumero2MouseClicked

    private void lbJogadorNumero7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero7MouseClicked
        mudarCor(lbJogadorNumero7);
    }//GEN-LAST:event_lbJogadorNumero7MouseClicked

    private void lbJogadorNumero12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero12MouseClicked
        mudarCor(lbJogadorNumero12);
    }//GEN-LAST:event_lbJogadorNumero12MouseClicked

    private void lbJogadorNumero16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero16MouseClicked
        mudarCor(lbJogadorNumero16);
    }//GEN-LAST:event_lbJogadorNumero16MouseClicked

    private void lbJogadorNumero21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero21MouseClicked
        mudarCor(lbJogadorNumero21);
    }//GEN-LAST:event_lbJogadorNumero21MouseClicked

    private void lbJogadorNumero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero3MouseClicked
        mudarCor(lbJogadorNumero3);
    }//GEN-LAST:event_lbJogadorNumero3MouseClicked

    private void lbJogadorNumero8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero8MouseClicked
        mudarCor(lbJogadorNumero8);
    }//GEN-LAST:event_lbJogadorNumero8MouseClicked

    private void lbJogadorNumero17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero17MouseClicked
        mudarCor(lbJogadorNumero17);
    }//GEN-LAST:event_lbJogadorNumero17MouseClicked

    private void lbJogadorNumero22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero22MouseClicked
        mudarCor(lbJogadorNumero22);
    }//GEN-LAST:event_lbJogadorNumero22MouseClicked

    private void lbJogadorNumero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero4MouseClicked
        mudarCor(lbJogadorNumero4);
    }//GEN-LAST:event_lbJogadorNumero4MouseClicked

    private void lbJogadorNumero9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero9MouseClicked
        mudarCor(lbJogadorNumero9);
    }//GEN-LAST:event_lbJogadorNumero9MouseClicked

    private void lbJogadorNumero13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero13MouseClicked
        mudarCor(lbJogadorNumero13);
    }//GEN-LAST:event_lbJogadorNumero13MouseClicked

    private void lbJogadorNumero18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero18MouseClicked
        mudarCor(lbJogadorNumero18);
    }//GEN-LAST:event_lbJogadorNumero18MouseClicked

    private void lbJogadorNumero23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero23MouseClicked
        mudarCor(lbJogadorNumero23);
    }//GEN-LAST:event_lbJogadorNumero23MouseClicked

    private void lbJogadorNumero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero5MouseClicked
        mudarCor(lbJogadorNumero5);
    }//GEN-LAST:event_lbJogadorNumero5MouseClicked

    private void lbJogadorNumero10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero10MouseClicked
        mudarCor(lbJogadorNumero10);
    }//GEN-LAST:event_lbJogadorNumero10MouseClicked

    private void lbJogadorNumero14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero14MouseClicked
        mudarCor(lbJogadorNumero14);
    }//GEN-LAST:event_lbJogadorNumero14MouseClicked

    private void lbJogadorNumero19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero19MouseClicked
        mudarCor(lbJogadorNumero19);
    }//GEN-LAST:event_lbJogadorNumero19MouseClicked

    private void lbJogadorNumero24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbJogadorNumero24MouseClicked
        mudarCor(lbJogadorNumero24);
    }//GEN-LAST:event_lbJogadorNumero24MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        boolean teste = true;
        for (Numero numero : numerosJogador) {
            if (!numero.isFoiSorteado()) {
                teste = false;
            }
        }
        if (teste) {
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().removeAll();
            FimDoJogo p3 = new FimDoJogo(true);
            janela.add(p3, BorderLayout.CENTER);
            janela.pack();
            janela.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    public JLabel getLabel() {
        return lbNumeroSorteado;
    }
    
    public JTextArea getJTextArea(){
        return jTextArea1;
    }
    
    public ArrayList<JLabel> getListaLabel(){
        return listaComputador;
    }
    
    public ArrayList<Numero> getListaComputador(){
        return numerosComputador;
    }
    
    public ArrayList<Numero> getListaJogador(){
        return numerosJogador;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbComputadorNumero1;
    private javax.swing.JLabel lbComputadorNumero10;
    private javax.swing.JLabel lbComputadorNumero11;
    private javax.swing.JLabel lbComputadorNumero12;
    private javax.swing.JLabel lbComputadorNumero13;
    private javax.swing.JLabel lbComputadorNumero14;
    private javax.swing.JLabel lbComputadorNumero15;
    private javax.swing.JLabel lbComputadorNumero16;
    private javax.swing.JLabel lbComputadorNumero17;
    private javax.swing.JLabel lbComputadorNumero18;
    private javax.swing.JLabel lbComputadorNumero19;
    private javax.swing.JLabel lbComputadorNumero2;
    private javax.swing.JLabel lbComputadorNumero20;
    private javax.swing.JLabel lbComputadorNumero21;
    private javax.swing.JLabel lbComputadorNumero22;
    private javax.swing.JLabel lbComputadorNumero23;
    private javax.swing.JLabel lbComputadorNumero24;
    private javax.swing.JLabel lbComputadorNumero3;
    private javax.swing.JLabel lbComputadorNumero4;
    private javax.swing.JLabel lbComputadorNumero5;
    private javax.swing.JLabel lbComputadorNumero6;
    private javax.swing.JLabel lbComputadorNumero7;
    private javax.swing.JLabel lbComputadorNumero8;
    private javax.swing.JLabel lbComputadorNumero9;
    private javax.swing.JLabel lbJogadorNumero1;
    private javax.swing.JLabel lbJogadorNumero10;
    private javax.swing.JLabel lbJogadorNumero11;
    private javax.swing.JLabel lbJogadorNumero12;
    private javax.swing.JLabel lbJogadorNumero13;
    private javax.swing.JLabel lbJogadorNumero14;
    private javax.swing.JLabel lbJogadorNumero15;
    private javax.swing.JLabel lbJogadorNumero16;
    private javax.swing.JLabel lbJogadorNumero17;
    private javax.swing.JLabel lbJogadorNumero18;
    private javax.swing.JLabel lbJogadorNumero19;
    private javax.swing.JLabel lbJogadorNumero2;
    private javax.swing.JLabel lbJogadorNumero20;
    private javax.swing.JLabel lbJogadorNumero21;
    private javax.swing.JLabel lbJogadorNumero22;
    private javax.swing.JLabel lbJogadorNumero23;
    private javax.swing.JLabel lbJogadorNumero24;
    private javax.swing.JLabel lbJogadorNumero3;
    private javax.swing.JLabel lbJogadorNumero4;
    private javax.swing.JLabel lbJogadorNumero5;
    private javax.swing.JLabel lbJogadorNumero6;
    private javax.swing.JLabel lbJogadorNumero7;
    private javax.swing.JLabel lbJogadorNumero8;
    private javax.swing.JLabel lbJogadorNumero9;
    private javax.swing.JLabel lbNumeroSorteado;
    // End of variables declaration//GEN-END:variables
}
