/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author ANGEL
 */
@Entity
@Table(name="productor") //se crea en automatico la tabla productor
public class Productor implements Serializable{
    
    @Id//COLUMNA PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)//ID autogenerado 
    private Integer codigo;//se crea en automatico el codigo
    @Column
    private String nombre;
    @Column
    private Character sexo;
    @Column
    private Integer horasTrabajo;
    @Column
    private Integer sueldo;
    @OneToMany(mappedBy="productor",fetch=FetchType.EAGER)
    private Collection<Tabla> itemsCancion=new ArrayList();
    
    @OneToOne(mappedBy="productor")
    private Celular celular;

    public Productor() {
    }

    public Productor(Integer codigo, String nombre, Character sexo, Integer horasTrabajo, Integer sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.horasTrabajo = horasTrabajo;
        this.sueldo = sueldo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(Integer horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Collection<Tabla> getItemsCancion() {
        return itemsCancion;
    }

    public void setItemsCancion(Collection<Tabla> itemsCancion) {
        this.itemsCancion = itemsCancion;
    }
    

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    

}
