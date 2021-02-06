/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Darley
 */
public class controladorPersona {
    
    ArrayList<Persona> listaPersona = new ArrayList<>();
    
    public void agregarPersona(int id, String external_persona, String nombre, String apellido, String correo, String cedula, String telefono, String direccion){
        listaPersona.add(new Persona(id, external_persona, nombre, apellido, telefono, cedula, telefono, direccion));
    }

}
