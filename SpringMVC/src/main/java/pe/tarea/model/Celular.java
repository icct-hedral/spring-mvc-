/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ANGEL
 */
@Entity
@Table(name="celulares")
public class Celular implements Serializable {
    
    @Id
    private Integer numero;
    @Column
    private String marca;
    @Column
    private String sistema_op;
    
    @OneToOne
    @JoinColumn(name="codigo",nullable=false,unique=true,
            foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(codigo) reference productor(codigo)"))
    private Productor productor;

    public Celular() {
    }

    public Celular(Integer numero, String marca, String sistema_op) {
        this.numero = numero;
        this.marca = marca;
        this.sistema_op = sistema_op;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema_op() {
        return sistema_op;
    }

    public void setSistema_op(String sistema_op) {
        this.sistema_op = sistema_op;
    }
    
    
    
}
