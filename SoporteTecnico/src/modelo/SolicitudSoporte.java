/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.SolicitudSoporte to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pc
 */
public class SolicitudSoporte {
    
    private String nombreCliente;
    private String tipoProblema;
    private String descripcion;
    private LocalDateTime fechaHora;
    
    public SolicitudSoporte(String nombreCliente, String tipoProblema, String descripcion) {
        this.nombreCliente = nombreCliente;
        this.tipoProblema = tipoProblema;
        this.descripcion = descripcion;
        this.fechaHora = LocalDateTime.now();
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getTipoProblema() {
        return tipoProblema;
    }
    
    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

   @Override
public String toString() {
    return "-----------------------------\n" +
           "🧾 Customer: " + nombreCliente + "\n" +
           "🔧 Type of problem: " + tipoProblema + "\n" +
           "📋 Description: " + descripcion + "\n" +
           "🕒 Date and time: " + fechaHora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n" +
           "-----------------------------\n";
}

}
