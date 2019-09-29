/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.programamvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import com.udec.programamvc.model.ModelPaises;
import com.udec.programamvc.vista.VistaPaises;

/**
 * Esta clase define el controlador de la vista de paises.
 * @author ASUS
 */
public class ControlPaises implements ActionListener  {
    /**
     * Objeto tipo vistaPaises*/
    VistaPaises vista;
    /**
     * Objeto ModelPaises.*/
    ModelPaises model;

    /**
     * Constructor de la clase.
     * @param vista vista paises
     * @param model modelo paises.
     */
    public ControlPaises(VistaPaises vista, ModelPaises model) {
        this.vista = vista;
        this.model = model;
        this.vista.consultar.addActionListener(this);
        this.vista.setTitle("Listado paises");
        this.vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * Metodo donde recibe los eventos de la vista, para realizar alguna accion.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.vista.consultar) {
          vista.area.setText(""+vista.entrada.getSelectedItem()+": \n"+ model.infoPais(vista.entrada.getSelectedItem().toString()));
          
        }
    }
}
