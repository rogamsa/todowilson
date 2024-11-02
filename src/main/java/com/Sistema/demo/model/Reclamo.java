
package com.Sistema.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reclamos")
public class Reclamo {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private int articulo_id;
     private String comentario ;
     private byte[] imagen ;
     private Date fecha_reclamo; 

     // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticulo_id() {
        return articulo_id;
    }

    public void setArticulo_id(int articulo_id) {
        this.articulo_id = articulo_id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Date getFecha_reclamo() {
        return fecha_reclamo;
    }

    public void setFecha_reclamo(Date fecha_reclamo) {
        this.fecha_reclamo = fecha_reclamo;
    }
}
