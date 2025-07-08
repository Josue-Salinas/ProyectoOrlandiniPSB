/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author FABRIZZIO
 */
public class DatosCompartidos {
    
    public static HashMap<String, Usuario> usuarios = new HashMap<>();
    public static ArrayList<PuntoCritico> puntosCriticos = new ArrayList<>();
    public static ArrayList<PuntoCritico> historialSolucionado = new ArrayList<>();
    public static int contadorSesion = 0;
    
        static {
        
        usuarios.put("juan.perez@gmail.com", new Usuario("Juan Perez", "juan.perez@gmail.com", "Clave123"));
        usuarios.put("ana.lopez@hotmail.com", new Usuario("Ana Lopez", "ana.lopez@hotmail.com", "Contrasena1"));
        usuarios.put("carlos.martinez@yahoo.com", new Usuario("Carlos Martinez", "carlos.martinez@yahoo.com", "Segura456"));
        usuarios.put("luis.torres@gmail.com", new Usuario("Luis Torres", "luis.torres@gmail.com", "MiPass789"));
        usuarios.put("maria.gomez@gmail.com", new Usuario("Maria Gomez", "maria.gomez@gmail.com", "M4r14G0m3z"));
        usuarios.put("admin@admin.com", new Usuario("Administrador", "admin@admin.com", "Admin123"));


        puntosCriticos.add(new PuntoCritico("Av. Brasil 123", "Jesús María", "Alta", "Basura acumulada por más de 3 días"));
        puntosCriticos.add(new PuntoCritico("Calle Los Rosales 456", "Surco", "Media", "Contenedor desbordado con bolsas rotas"));
        puntosCriticos.add(new PuntoCritico("Av. La Marina 789", "San Miguel", "Baja", "Escombros dejados por construcción"));
        puntosCriticos.add(new PuntoCritico("Jr. Puno 321", "Cercado de Lima", "Alta", "Acumulación de basura en esquina"));
        puntosCriticos.add(new PuntoCritico("Av. Primavera 654", "Miraflores", "Media", "Basura maloliente sin recojo"));
    }
}
