/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.SolicitudControlador to edit this template
 */
package controlador;

import modelo.SolicitudSoporte;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author pc
 */
public class SolicitudControlador {

    private Stack<SolicitudSoporte> pilaSolicitudes;
    
    
    private static SolicitudControlador instancia;

   
    private SolicitudControlador() {
        pilaSolicitudes = new Stack<>();
    }


    public static SolicitudControlador getInstancia() {
        if (instancia == null) {
            instancia = new SolicitudControlador();
        }
        return instancia;
    }


    public void registrarSolicitud(String nombreCliente, String tipoProblema, String descripcion) {
        SolicitudSoporte solicitud = new SolicitudSoporte(nombreCliente, tipoProblema, descripcion);
        pilaSolicitudes.add(solicitud);
    }

    public SolicitudSoporte verSolicitud() {
        if (!pilaSolicitudes.empty()) {
            return pilaSolicitudes.peek();
        } else {
            return null;
        }
    }

    public SolicitudSoporte atenderSolicitud() {
        if (!pilaSolicitudes.empty()) {
            return pilaSolicitudes.pop();
        } else {
            return null;
        }
    }

    public List<SolicitudSoporte> obtenerTodasLasSolicitudes() {
        return new ArrayList<>(pilaSolicitudes);
    }

    public void vaciarSolicitudes() {
        pilaSolicitudes.clear();
    }

    public boolean estaVacia() {
        return pilaSolicitudes.empty();
    }
}
