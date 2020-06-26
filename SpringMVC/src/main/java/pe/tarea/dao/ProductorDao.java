/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.dao;

import java.util.Collection;
import pe.tarea.model.Productor;

/**
 *
 * @author ANGEL
 */
public interface ProductorDao {
    
    public abstract void insert(Productor productor);
    public abstract void update(Productor productor);
    public abstract void delete(Integer codigo);
    public abstract Productor findById(Integer codigo);
    public abstract Collection<Productor> findAll();
    public abstract boolean isExist (Integer codigo);
    
    
    
    
    
}
