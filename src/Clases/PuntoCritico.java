/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author FABRIZZIO
 */
public class PuntoCritico {
    
    private String direccion;
    private String distrito;
    private String prioridad;
    private String observacion;
    private String fechaHora;
    
    public PuntoCritico(String direccion, String distrito, String prioridad, String observacion){
        this.direccion = direccion;
        this.distrito = distrito;
        this.prioridad = prioridad;
        this.observacion = observacion;
        
        DateTimeFormatter aea = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //pq formatter? pa que cuando muestre la fecha xx-xx-xxxx 11:11:11123124124532523523523532
        this.fechaHora = LocalDateTime.now().format(aea);
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDistrito(){
        return distrito;
    }
    
    public void setDistrito(String distrito){
        this.distrito = distrito;
    }
    
    public String getPrioridad(){
        return prioridad;
    }
    
    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }
    
    public String getObservacion(){
        return observacion;
    }
    
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
    
    public String getFechaHora(){
        return fechaHora;
    }
}