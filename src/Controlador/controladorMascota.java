/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mascota;
import Modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class controladorMascota {
    ArrayList<Mascota> listaMascotas;

    public controladorMascota() {
    }
    
    public void crearLista(){
        listaMascotas=new ArrayList<>();
    }
    
    public void agregarMacota(int id, String external_mascota, String nombre, int edad, String raza, String especie, String tamanio, String sexo, String colorPelaje, Persona persona){
        listaMascotas.add(new Mascota(id, external_mascota, nombre, edad, raza, especie, tamanio, sexo, colorPelaje, persona));
    }
    
    public ArrayList<Mascota> buscarMascotas(String cedula){
        ArrayList<Mascota> listMascota = new ArrayList<>();
        for (Mascota mascota : listaMascotas) {
            if(mascota.getPersona().getCedula().equals(cedula)){
                listMascota.add(mascota);
            }
        }
        return listMascota;
    }
    
    public ArrayList<Mascota> getListaMascota(){
        return listaMascotas;
    }
    
    
}
