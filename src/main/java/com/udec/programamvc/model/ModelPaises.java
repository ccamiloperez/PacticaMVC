/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.programamvc.model;

/**
 * En esta clase se define el modelo paises.
 * @author ASUS
 */
public class ModelPaises {
    /**
     * Vector de paises. */
    private String[] paises={"Colombia","Brasil","Bolivia","Argentina","Chile","Venezuela"};
    
    /**
     * Metodo que envia la descripcion dependiendo del pais seleccionado.
     * @param pais
     * @return String con texto de descripcion del pais.
     */
    public String infoPais(String pais){
       String informacion="";
        for (int i = 0; i < paises.length; i++) {
            if(pais.equals(paises[i])){
                if(pais.equals("Colombia")){
                    informacion="Colombia, oficialmente República de Colombia, es un país soberano situado en la región noroccidental de América del Sur, que se constituye en un estado unitario, social y democrático de derecho cuya forma de gobierno es presidencialista";
                     return informacion;
                }else if (pais.equals("Brasil")) {
                    informacion="Brasil, oficialmente República Federativa del Brasil​​​​, es un país soberano de América del Sur que comprende la mitad oriental del subcontinente y algunos grupos de pequeñas islas en el océano Atlántico";
                     return informacion;
                }else if (pais.equals("Bolivia")) {
                    informacion="Bolivia, oficialmente Estado Plurinacional de Bolivia, ​​ es un país soberano situado en la región centro-occidental de América del Sur, políticamente se constituye como un estado plurinacional, descentralizado con autonomías.";
                 return informacion;
                }else if (pais.equals("Argentina")) {
                    informacion="Argentina, llamada oficialmente República Argentina, ​ es un país soberano de América del Sur, ubicado en el extremo sur y sudeste de dicho subcontinente. Adopta la forma de gobierno republicana, democrática, representativa y federal.";
                 return informacion;
                }else if (pais.equals("Chile")) {
                    informacion="Chile es un país ubicado en el extremo sudoeste de América del Sur. Su nombre oficial es República de Chile​ y su capital es la ciudad de Santiago. El Congreso Nacional se encuentra en Valparaíso.";
                 return informacion;
                }else if (pais.equals("Venezuela")) {
                informacion="Venezuela, oficialmente denominada República Bolivariana de Venezuela, es un país situado en la parte septentrional de América del Sur, constituido por una parte continental y por un gran número de islas pequeñas e islotes en el mar Caribe, cuya capital y mayor aglomeración urbana es la ciudad de Caracas.";
                 return informacion;
                }
            }
        } return informacion;
    }
}
