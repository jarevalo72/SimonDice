/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juego.simon.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ing. Jorge A. Arévalo A.
 */
public class GestionDatos {
    // Atributos
    private Conexion con;
    private String error;

    /**
     * Crea una nueva instancia de la clase con una conexión por defecto
     */
    public GestionDatos() {
        this.con = new Conexion();
    }

    /**
     * Registra en la base de datos el resultado del juego
     * @param juego Instancia del juego actual
     * @param nombre Nombre del jugador
     * @return true si el registro fue exitoso, false en caso contrario
     */
    public boolean registrarJuego(JuegoSimonDice juego, String nombre) {
        boolean reg = false;
        try {
            Connection c = con.conectar();
            Statement stm = c.createStatement();
            int res;
            res = stm.executeUpdate("insert into Usuario (nombre, puntaje, nivel) "
                    + "values ('" + nombre + "', " + juego.getPuntaje() + ", " +
                    juego.getNivelAlcanzado() + ")");
            if(res != 0)
                reg = true;
            stm.close();
            c.close();
        }
        catch(Exception e) {
            this.error = e.getMessage();
        }
        return reg;
    }

}
