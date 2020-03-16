/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego.simon.model;

/**
 *
 * @author Ing. Jorge A. Arévalo A.
 */
public class Letra {
    // Atributos
    private char letra;
    
    //Constructor
    /**
     * Constructor con parámetros
     * @param letra nuevo caracter
     */
    public Letra(char letra) {
        this.letra = letra;
    }

    //Métodos
    /**
     * Permite conocer el valor actual de la letra
     * @return letra actual
     */
    public char getLetra() {
        return letra;
    }

    /**
     * Compara si dos letras son eguales
     * @param letra Letra a comparar con la actual
     * @return true si las letras son iguales, false si no.
     */
    public boolean isEquals(Letra letra) {
        boolean equals = false;
        if(letra.getLetra() == this.letra) {
            equals = true;
        }
        else if(this.letra >= 97 && this.letra - 32 == letra.getLetra()) {
            equals = true;
        }
        else if(this.letra + 32 == letra.getLetra()) {
            equals = true;
        }
        return equals;
    }
    
}
