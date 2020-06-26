/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author ANGEL
 */
@Entity
@Table (name="tablas")
public class Tabla implements Serializable {
    
    @Id//columna PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_cancion;
    @Column
    private String nombre;
    @Column
    private String artista;
    @Column
    private Integer precio;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private Date fechaEntrega;
    @ManyToOne
    @JoinColumn(name="codigo",nullable=false,
            foreignKey=@ForeignKey(foreignKeyDefinition = "foreign key(codigo) references productor(codigo)"))
    private Productor productor;

    public Tabla() {
    }

    public Tabla(String id_cancion, String nombre, String artista, Integer precio, Date fechaEntrega) {
        this.id_cancion = id_cancion;
        this.nombre = nombre;
        this.artista = artista;
        this.precio = precio;
        this.fechaEntrega = fechaEntrega;
    }

    public String getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(String id_cancion) {
        this.id_cancion = id_cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    
    
    
}
