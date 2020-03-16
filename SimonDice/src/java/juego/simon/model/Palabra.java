/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego.simon.model;

import java.util.ArrayList;

/**
 *
 * @author Ing. Jorge A. Arévalo A.
 */
public class Palabra {
    // Atributos
    private ArrayList<Letra> letras;
    
    //Constructor
    /**
     * Constructor con parametros
     * @param palabra Palabra a construir
     */
    public Palabra(String palabra) {
        this.letras = new ArrayList<>();
        for(int i = 0; i < palabra.length(); i++) {
            letras.add(new Letra(palabra.charAt(i)));
        }
    }

    //Métodos
    /**
     * Permite conocer el conjunto de letras que define la palabra
     * @return Conjunto de letras actuales
     */
    public ArrayList<Letra> getLetras() {
        return letras;
    }

    /**
     * Indica si el conjunto de letras ingresado coincide con la palabra completa
     * @param jugadas Vector con las letras jugadas.
     * @return true si las letras ingresadas coinciden con la palabra, false en caso contrario.
     */
    public boolean isComplete(ArrayList<Letra> jugadas) {
        boolean complete = true;
        int contador = 0;
        while(contador < this.letras.size() && complete) {
            Letra l = this.letras.get(contador);
            if(!buscarLetraVector(l, jugadas)) {
                complete = false;
            }
            contador++;
        }
        return complete;
    }

    /**
     * Indica si dentro de un vector se encuentra una letra determinada.
     * @param l Letra que se está buscando.
     * @param vectorLetras Vector de letras en la que se realizará la busqueda.
     * @return true si se encontró la letra en el vector, false en caso contrario.
     */
    private boolean buscarLetraVector(Letra l, ArrayList<Letra> vectorLetras) {
        boolean estaLetra = false;
        for(Letra letra : vectorLetras) {
            if(letra.equals(l)) {
                estaLetra = true;
                break;
            }
        }
        return estaLetra;
    }

    /**
     * Informa si una letra hace parte de la palabra.
     * @param letra La letra que se desea saber si pertenece a la palabra.
     * @return true si la letra pertenece a la palabra, false en caso contrario.
     */
    public boolean estaLetra(Letra letra) {
        return buscarLetraVector(letra, this.letras);
    }

    /**
     * Devuelve el vector con las ocurrencias de las letras jugadas que están en
     * en la palabra y las letras que aún no se han ingresado reemplazandolas con
     *  el caracter '_'.
     * @param jugadas Vector con las letras ingresadas.
     * @return Conjunto de letras organizadas.
     */
    public ArrayList<Letra> getOcurrencias(ArrayList<Letra> jugadas) {
        ArrayList<Letra> visibles = new ArrayList<>();
        for(Letra l : this.letras) {
            if(!buscarLetraVector(l, jugadas)) {
                visibles.add(new Letra('_'));
            }
            else {
                visibles.add(l);
            }
        }
        return visibles;
    }
}
