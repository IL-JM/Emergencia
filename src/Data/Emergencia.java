/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Data;

import Cola.Base;
/**
 *
 * @author juanm
 */
public class Emergencia implements Base {
    private int tiempoAtencion;
    private int idEmergencia;
    private String tipoEmergencia;
    private int nivelPrioridad;

    public Emergencia() {
    }

    public Emergencia(String tipoEmergencia, int tiempoAtencion, int nivelPrioridad1) {
        this.tiempoAtencion = tiempoAtencion;
        this.idEmergencia = idEmergencia;
        this.tipoEmergencia = tipoEmergencia;
        this.nivelPrioridad = nivelPrioridad;
    }


    /**
     * Get the value of idEmergencia
     *
     * @return the value of idEmergencia
     */
    public int getIdEmergencia() {
        return idEmergencia;
    }

    /**
     * Set the value of idEmergencia
     *
     * @param idEmergencia new value of idEmergencia
     */
    public void setIdEmergencia(int idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    

    /**
     * Get the value of tiempoAtencion
     *
     * @return the value of tiempoAtencion
     */
    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    /**
     * Set the value of tiempoAtencion
     *
     * @param tiempoAtencion new value of tiempoAtencion
     */
    public void setTiempoAtencion(int tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    

    /**
     * Get the value of tipoEmergencia
     *
     * @return the value of tipoEmergencia
     */
    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    /**
     * Set the value of tipoEmergencia
     *
     * @param tipoEmergencia new value of tipoEmergencia
     */
    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }


    /**
     * Get the value of nivelPrioridad
     *
     * @return the value of nivelPrioridad
     */
    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    /**
     * Set the value of nivelPrioridad
     *
     * @param nivelPrioridad new value of nivelPrioridad
     */
    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public String toString() {
        return "AtencionEmergencia{" + "tiempoAtencion=" + tiempoAtencion + ", idEmergencia=" + idEmergencia + ", tipoEmergencia=" + tipoEmergencia + ", nivelPrioridad=" + nivelPrioridad + '}';
    }

    @Override
    public Base copy() {
        return new Emergencia(tipoEmergencia, tiempoAtencion, nivelPrioridad);
    }

    
}

