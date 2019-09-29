/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.programamvc;
import com.udec.programamvc.vista.VistaPaises;
import com.udec.programamvc.controlador.ControlPaises;
import com.udec.programamvc.model.ModelPaises;

/**
 * Esta clase es donde inicia el programa.
 * @author Cristian Perez
 */
public class Main {
    /**
     * Constructor de la clase principal.
     */
    public Main(){
        VistaPaises vista=new VistaPaises();
        ModelPaises model=new ModelPaises();
        ControlPaises control=new ControlPaises(vista, model);
    }
   
    public static void main(String[] args) {
       Main inicio= new Main();
    }
    
}
