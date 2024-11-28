/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author Santi
 */
public class Futbolista extends Persona {
    // Atributos propios de futbolista
    
    String club;
    int contrato;
    int carrera;
    static int contador = 0;
    
    public Futbolista() {
        contador++;
    }

    

    public Futbolista(String club, int contrato, int carrera, int edad, String nombre, String apellido, String direccion, String numero) {
        super(edad, nombre, apellido, direccion, numero);
        this.club = club;
        this.contrato = contrato;
        this.carrera = carrera;
        contador++;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    
}
