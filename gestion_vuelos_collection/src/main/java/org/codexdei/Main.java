package org.codexdei;

import org.codexdei.modelos.Vuelo;

import javax.swing.*;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static boolean estadoPrograma = true;
    public static void main(String[] args) {

        do {

            try{

                int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "1. Mostrar lista de vuelos\n" +
                        "2. Ultimo Vuelo en llegar\n" +
                        "3. Vuelo con menor numero de pasajeros\n" +
                        "4. Salir"
                ));

                switch (opcion){

                    case 1 -> {

                        listarVuelos();
                    }
                    case 2 -> {

                        ultimoVueloLlegar();
                    }
                    case 3 -> {

                        menorNumeroPasajeros();
                    }

                    case 4 -> {

                        estadoPrograma = false;
                    }
                }


            }catch (InputMismatchException | ParseException e){


            }

        }while (estadoPrograma);

    }

    private static List<Vuelo> retornarLista() throws ParseException {

        List<Vuelo> listaVuelos = new ArrayList<>();

        listaVuelos.add(new Vuelo("AAL 933","New York","Santiago", "Lun 29 Ago 2021 05:39 hrs",62));
        listaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", "Lun 31 Ago 2021 04:45 hrs", 47));
        listaVuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", "Lun 30 Ago 2021 16:00 hrs", 52));
        listaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", "Lun 29 Ago 2021 13:22 hrs", 59));
        listaVuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", "Lun 31 Ago 2021 14:05 hrs", 25));
        listaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", "Lun 31 Ago 2021 05:20 hrs", 29));
        listaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", "Lun 30 Ago 2021 08:45 hrs", 55));
        listaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", "Lun 29 Ago 2021 07:41 hrs", 51));
        listaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", "Lun 30 Ago 2021 10:35 hrs", 48));
        listaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", "Lun 29 Ago 2021 09:14 hrs", 59));
        listaVuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", "Lun 31 Ago 2021 08:33 hrs", 31));
        listaVuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", "Lun 31 Ago 2021 15:15 hrs", 29));
        listaVuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", "Lun 30 Ago 2021 08:14 hrs", 47));
        listaVuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", "Lun 29 Ago 2021 22:53 hrs", 60));
        listaVuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", "Lun 31 Ago 2021 09:57 hrs", 32));
        listaVuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", "Lun 31 Ago 2021 04:00 hrs", 35));
        listaVuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", "Lun 29 Ago 2021 07:45 hrs", 61));
        listaVuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", "Lun 30 Ago 2021 07:12 hrs", 58));
        listaVuelos.add(new Vuelo("LAT 501", "París", "Santiago", "Lun 29 Ago 2021 18:29 hrs", 49));
        listaVuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", "Lun 30 Ago 2021 15:45 hrs", 39));

        return listaVuelos;
    }

    private static void listarVuelos() throws ParseException {

        List<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos = retornarLista();

        System.out.println(listaVuelos);
    }

    private static void ultimoVueloLlegar() throws ParseException {

        List<Vuelo> listaVuelos = new LinkedList<>();
        listaVuelos = retornarLista();
        //ordena por un atributo de la clase, en este caso 'FechaHoraLLegada'
        listaVuelos.sort(Comparator.comparing(Vuelo::getFechaHoraLlegada));
        Vuelo ultimoVuelo = listaVuelos.get(listaVuelos.size() - 1);
        System.out.println("El ultimo vuelo es: " + ultimoVuelo);
    }

    private static void menorNumeroPasajeros() throws ParseException {

        List<Vuelo> listaVuelos = new LinkedList<>();
        listaVuelos = retornarLista();
        //ordena por un atributo de la clase, en este caso 'FechaHoraLLegada'
        listaVuelos.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));
        Vuelo menorNumeroPasajeros = listaVuelos.get(0);
        System.out.println("El vuelo con el menor numero de pasajeros es: " + menorNumeroPasajeros);
    }

}