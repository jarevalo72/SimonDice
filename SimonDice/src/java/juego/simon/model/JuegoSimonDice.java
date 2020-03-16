/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego.simon.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ing. Jorge A. Arévalo A.
 */
public class JuegoSimonDice {
    // Constantes
    public static final int CANT_PALABRAS_DIC = 2;
    public static final int CANT_LETRAS_DIC_1 = 3;
    public static final int CANT_LETRAS_DIC_2 = 4;
    public static final int CANT_LETRAS_DIC_3 = 6;
    public static final int CANT_LETRAS_DIC_4 = 8;
    public static final int CANT_LETRAS_DIC_5 = 10;
    public static final int CANT_LETRAS_DIC_6 = 12;
    public static final int CANT_LETRAS_DIC_7 = 14;
    public static final int CANT_LETRAS_DIC_8 = 16;
    public static final int CANT_LETRAS_DIC_9 = 18;
    public static final int CANT_LETRAS_DIC_10 = 20;
    public static final int PUNTAJE_ACIERTO = 2;
    public static final int NIVELES = 10;
    public static final int NO_INICIADO = -1;
    public static final int JUGANDO = 0;
    public static final int FINALIZADO = 1;
    
    // Atributos
    private Palabra[] diccionario1;
    private Palabra[] diccionario2;
    private Palabra[] diccionario3;
    private Palabra[] diccionario4;
    private Palabra[] diccionario5;
    private Palabra[] diccionario6;
    private Palabra[] diccionario7;
    private Palabra[] diccionario8;
    private Palabra[] diccionario9;
    private Palabra[] diccionario10;
    private Palabra palabraActual;
    private ArrayList<Letra> jugadas;
    private int aciertos;
    private int puntaje;
    private int nivelAlcanzado;
    private int estado;
    private int indice;
    private String nombre;
    
    // Constructor
    /**
     * Crea una nueva instancia del juego.
     */
    public JuegoSimonDice() {
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario1 = new Palabra[CANT_LETRAS_DIC_1];
            for(int j = 0; j < CANT_LETRAS_DIC_1; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario1[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario2 = new Palabra[CANT_LETRAS_DIC_2];
            for(int j = 0; j < CANT_LETRAS_DIC_2; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario2[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario3 = new Palabra[CANT_LETRAS_DIC_3];
            for(int j = 0; j < CANT_LETRAS_DIC_3; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario3[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario4 = new Palabra[CANT_LETRAS_DIC_4];
            for(int j = 0; j < CANT_LETRAS_DIC_4; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario4[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario5 = new Palabra[CANT_LETRAS_DIC_5];
            for(int j = 0; j < CANT_LETRAS_DIC_5; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario5[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario6 = new Palabra[CANT_LETRAS_DIC_6];
            for(int j = 0; j < CANT_LETRAS_DIC_6; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario6[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario7 = new Palabra[CANT_LETRAS_DIC_7];
            for(int j = 0; j < CANT_LETRAS_DIC_7; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario7[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario8 = new Palabra[CANT_LETRAS_DIC_8];
            for(int j = 0; j < CANT_LETRAS_DIC_8; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario8[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario9 = new Palabra[CANT_LETRAS_DIC_9];
            for(int j = 0; j < CANT_LETRAS_DIC_9; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario9[i] = new Palabra(p);
        }
        for(int i = 0; i < CANT_PALABRAS_DIC; i++) {
            String p = "";
            Random rnd = new Random();
            diccionario10 = new Palabra[CANT_LETRAS_DIC_10];
            for(int j = 0; j < CANT_LETRAS_DIC_10; j++) {
                p += String.valueOf(rnd.nextInt(26) + 65);
            }
            diccionario10[i] = new Palabra(p);
        }
        estado = NO_INICIADO;
    }

    /**
     * Permite conocer el puntaje actual
     * @return Puntaje actual
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Permite conocer el nivel alcanzado
     * @return Nivel alcanzado
     */
    public int getNivelAlcanzado() {
        return nivelAlcanzado;
    }

    // Métodos
    /**
     * Permite conocer la palabra actual del juego
     * @return Palabra actual
     */
    public Palabra getPalabraActual() {
        return palabraActual;
    }

    /**
     * Permite conocer el estado del juego
     * @return Estado del juego
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Permite conocer las letras jugadas.
     * @return Letras jugadas.
     */
    public ArrayList<Letra> getJugadas() {
        return jugadas;
    }

    /**
     * Permite conocer los aciertos de la jugada actual
     * @return Aciertos de la jugada actual 
     */
    public ArrayList<Letra> getOcurrencias() {
        return palabraActual.getOcurrencias(jugadas);
    }

    /**
     * Inicia una nueva instancia del juego
     */
    public void iniciarJuego() {
        this.jugadas = new ArrayList<>();
        this.palabraActual = diccionario1[0];
        this.estado = JUGANDO;
        this.aciertos = 0;
        this.nivelAlcanzado = 1;
        this.puntaje = 0;
        this.indice = 0;
        this.nombre = "";
    }

    /**
     * Evalua una palabra jugada, para definir la cantidad de aciertos, el puntaje
     * alcanzado y el nivel alcanzado.
     * @param palabraIngresada Palabra jugada que será evaluada
     * @return true si el juego continua, false si el juego finaliza.
     */
    public boolean jugarPalabra(Palabra palabraIngresada) {
        boolean continuar = false;
        if(estado == JUGANDO) {
            for(int i = 0; i < palabraIngresada.getLetras().size(); i++) {
                Letra l = palabraIngresada.getLetras().get(i);
                jugadas.add(l);
                if(palabraActual.estaLetra(l)) {
                    aciertos++;
                    if(palabraActual.isComplete(jugadas) && indice < CANT_PALABRAS_DIC - 1) {
                        indice++;
                    }
                    else if(palabraActual.isComplete(jugadas) && indice == CANT_PALABRAS_DIC - 1) {
                        indice--;
                        nivelAlcanzado++;
                    }
                    if(nivelAlcanzado == 11) {
                        estado = FINALIZADO;
                        indice = 0;
                        puntaje = aciertos * PUNTAJE_ACIERTO;
                    }
                    continuar = true;
                }
                else {
                    estado = FINALIZADO;
                    indice = 0;
                    puntaje = aciertos * PUNTAJE_ACIERTO;
                }
            }
        }
        return continuar;
    }

}
