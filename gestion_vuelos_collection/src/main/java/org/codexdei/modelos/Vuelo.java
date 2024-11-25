package org.codexdei.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHoraLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, String fechaHoraLlegadaStr, Integer cantidadPasajeros) throws ParseException {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        SimpleDateFormat formatter = new SimpleDateFormat("EEE dd MMM yyyy HH:mm 'hrs'", java.util.Locale.getDefault());
        this.fechaHoraLlegada = formatter.parse(fechaHoraLlegadaStr);
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
        return  "Vuelo=" + nombre + " || " +
                "Origen=" + origen + " || " +
                "Destino=" + destino + " || " +
                "Fecha Llegada=" + fechaHoraLlegada + " || " +
                "CantidadPasajeros=" + cantidadPasajeros + " \n ";
    }
}
