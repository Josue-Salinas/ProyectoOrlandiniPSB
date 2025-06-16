/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author FABRIZZIO
 */
public class PuntoCritico {
    
    private String direccion;
    private String distrito;
    private String prioridad;
    
    public PuntoCritico(String direccion, String distrito, String prioridad){
        this.direccion = direccion;
        this.distrito = distrito;
        this.prioridad = prioridad;
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
}
