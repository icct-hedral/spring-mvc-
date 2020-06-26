/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import pe.tarea.model.Productor;

/**
 *
 * @author ANGEL
 */
@Repository//bean "productorDaoImpl"
public class ProductorDaoImpl implements ProductorDao {
    
    @PersistenceContext
    private EntityManager entityManager;//objeto que permite la conexion a la base de datos

    @Override
    public void insert(Productor productor) {
        entityManager.persist(productor);
    }

    @Override
    public void update(Productor productor) {
        entityManager.merge(productor);
    }

    @Override
    public void delete(Integer codigo) {
        entityManager.remove(this.findById(codigo));
    }

    @Override
    public Productor findById(Integer codigo) {
        return entityManager.find(Productor.class,codigo);
    }

    @Override
    public Collection<Productor> findAll() 
    {
        Query query=entityManager.createNativeQuery("select * from productor order by codigo",Productor.class);
        return query.getResultList();
    }

    @Override
    public boolean isExist(Integer codigo) {
        return entityManager.contains(codigo);
    }

   
}
