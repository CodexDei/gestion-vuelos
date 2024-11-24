package org.codexdei.modelos;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHoraLlegada;
    private Integer cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaHoraLlegada, Integer cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    public String getNombre(){
        return this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(Date fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return  "Nombre='" + nombre + '\'' +
                "Origen='" + origen + '\'' +
                "Destino='" + destino + '\'' +
                "FechaHoraLlegada=" + fechaHoraLlegada +
                "CantidadPasajeros=" + cantidadPasajeros;
    }
}
