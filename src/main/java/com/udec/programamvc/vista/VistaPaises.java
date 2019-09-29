/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.programamvc.vista;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 * En esta clase se construye la parte grafica o vista de la aplicacion.
 * @author ASUS
 */
public class VistaPaises extends JFrame{
    /**
     * Desplegable para realizar la seleccion del pais.*/
    public JComboBox entrada;
    /**
     * Boton para enviar evento y realizar consulta.*/
    public JButton consultar;
    /**
     * Area para imprimir descripcion de los paises.*/
    public JTextArea area;
    /**
     * Contenedor de la ventana*/
    public Container cont;
   

    /**
     * Constructor de la clase donde se crean y ubican cada uno de los componentes.
     */
    public VistaPaises(){
        cont=getContentPane();
        cont.setBackground(Color.lightGray);
        Border borde = BorderFactory.createLineBorder(Color.BLACK);
        
        setLayout(null);
        setSize(350,280);
        
        entrada= new JComboBox();
        entrada.addItem("");
        entrada.addItem("Colombia");
        entrada.addItem("Brasil");
        entrada.addItem("Bolivia");
        entrada.addItem("Argentina");
        entrada.addItem("Chile");
        entrada.addItem("Venezuela");
        entrada.setBounds(20,20,150,20);
        entrada.setBorder(borde);
        consultar= new JButton("Consultar");
        consultar.setBounds(190,20,100,20);
        area= new JTextArea();
        area.setBorder(borde);
        area.setBounds(20,50,280,180);
        area.setEditable(false);
        area.setLineWrap(true);
        
        add(entrada);
        add(consultar);
        add(area);
        
        setVisible(true);
    }
}
