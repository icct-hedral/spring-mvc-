/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.tarea.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.tarea.dao.ProductorDao;
import pe.tarea.model.Productor;

/**
 *
 * @author ANGEL
 */
@Service
public class ProductorServiceImpl implements ProductorService {
    
    @Autowired
    @Qualifier("productorDaoImpl")
    private ProductorDao productorDao;

    @Override
    @Transactional(readOnly=false)//transaccion fuerte
    public void insert(Productor productor) {
        productorDao.insert(productor);
    }

    @Override
    @Transactional(readOnly=false)
    public void update(Productor productor) {
        productorDao.update(productor);
        
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer codigo) {
       productorDao.delete(codigo);
    }

    @Override
    @Transactional(readOnly=true)//transs debil
    public Productor findById(Integer codigo) {
        return productorDao.findById(codigo);
    }

    @Override
    @Transactional(readOnly=true)
    public Collection<Productor> findAll() {
        return productorDao.findAll();
    }


    @Override
    @Transactional(readOnly=true)
    public boolean isExist(Integer codigo) {
        return productorDao.isExist(codigo);
    }

    
}
