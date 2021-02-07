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
    
    public boolean validarPasword(String pass1,String pass2){
        if(pass1.equals(pass2))return true;
        else return false;
    }
    
    public boolean validarCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            // ConstantesApp.LongitudCedula
            if (cedula.length() == 10){
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validación cédula
                    // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    int verificador = Integer.parseInt(cedula.substring(9,10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    }else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else cedulaCorrecta = false;
                } else cedulaCorrecta = false;
            }else cedulaCorrecta = false;
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }
    
    public ArrayList<Persona> getListaPersonas(){
        return listaPersona;
    }
    
    public boolean cedulaRepetida(String cedula){
        for (Persona persona : listaPersona) {
            if(persona.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }

}
