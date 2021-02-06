/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cuenta;
import Modelo.Persona;
import Modelo.Rol;
import java.util.ArrayList;

/**
 *
 * @author Darley
 */
public class controladorPersona {
    
    ArrayList<Persona> listaPersona;
    
    public void crearLista(){
        listaPersona= new ArrayList<>();
    }
    
    public void agregarPersona(int id, String external_persona, String nombre, String apellido, String correo, String cedula, String telefono, String direccion,Rol rol,Cuenta cuenta){
        listaPersona.add(new Persona(id, external_persona, nombre, apellido, telefono, cedula, telefono, direccion, rol, cuenta));
    }
    
    public Persona buscarPersonaPorNombre(String nombre){
        Persona persona = new Persona();
        for (Persona personas : listaPersona) {
            if((personas.getNombre()+" "+personas.getApellido()).equalsIgnoreCase(nombre)){
                persona=personas;
            }
        }
        return persona;
    }
    
    public Persona buscarPersonaPorCedula (String cedula){
        Persona persona = new Persona();
        for (Persona personas : listaPersona) {
            if(personas.getCedula().equalsIgnoreCase(cedula)){
                persona=personas;
            }
        }
        return persona;
    }
    
    public boolean validarPasword(String cedula1,String cedula2){
        if(cedula1.equals(cedula2))return true;
        else return false;
    }

}
