package com.trabajouy.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.trabajouy.model.Publicar.ESTADO;

public class Empresa extends Usuario {

    private Map<String, Publicar> publicaciones;
    private Map<String, CompraPaquete> comprapaquetes;// nombre paquete de compra paquete y compra apquete
    private String empresa;
    private String descripcion;
    private String link;

    public Empresa(String nickname, String nombre, String apellido, String correo, String contraseña, String foto, String empresa, String descripcion,
            String link) {
        super(nickname, nombre, apellido, correo, contraseña, foto);
        this.empresa = empresa;
        this.descripcion = descripcion;
        if (link != "") {
        	this.link = link;
        } else {
        	this.link = null;
        }
        this.publicaciones = new HashMap<String, Publicar>();
        this.comprapaquetes = new HashMap<String, CompraPaquete>();
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLink() {
        return link;
    }

    public void modificarEmpresa(String nombre, String apellido, String contraseña, String foto, String empresa, String descripcion, String link) {
    	modificar(nombre, apellido, contraseña, foto);
    	this.empresa = empresa;
    	this.descripcion = descripcion;
    	this.link = link;
    }
    
    
    public void addPublicacion(Publicar publicacion) {
        this.publicaciones.put(publicacion.getOferta().getNombre(), publicacion);
    }

    /*public void removePublicacion(Publicar publicacion) {
        this.publicaciones.remove(publicacion.getOferta().getNombre(), publicacion);
    }*/

    public Map<String, Publicar> getPublicaciones() {
        return publicaciones;
    }
   

    public void agregarCompraPaquete(CompraPaquete comprap) {
        comprapaquetes.put(comprap.getPaquete().getNombre(), comprap);
    }

    public Collection<String> getOfertas() {
    	Collection<String> ofertas = new Vector<String>();
        for (Publicar publicacion : this.publicaciones.values()) {
            ofertas.add(publicacion.getOferta().getNombre());
        }
        return ofertas;
    }
    
    public Collection<String> getOfertasConfirmadas() {
    	Collection<String> ofertas = new Vector<String>();
        for (Publicar publicacion : this.publicaciones.values()) {
        	if (publicacion.getEstado() == ESTADO.Confirmado && publicacion.vencido())
            ofertas.add(publicacion.getOferta().getNombre());
        }
        return ofertas;
    }
   
    public Collection<String> getOfertasIngresadas() {
    	Collection<String> ofertas = new Vector<String>();
        for (Publicar publicacion : this.publicaciones.values()) {
        	if (publicacion.getEstado() == ESTADO.Ingresado) {
        		ofertas.add(publicacion.getOferta().getNombre());
        	}
        }
         return ofertas;   
        }
        
    public Map<String, CompraPaquete> getCompraPaquetes() {
    	return this.comprapaquetes;
    }
    
    public CompraPaquete getCompraPaquete(String paquete) {
    	return this.comprapaquetes.get(paquete);
    }

    @Override
    public DTUsuario getDT() {
        return new DTEmpresa(this);
    }
}
