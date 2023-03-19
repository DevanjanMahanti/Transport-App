package com.transport.transport.dao;

import com.transport.transport.entity.BaseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@Repository
public abstract class JpaCrudDao<ID, T extends BaseEntity<ID>> {

    @PersistenceContext
    protected EntityManager em;

    protected Class<T> entityClass;

    public JpaCrudDao(Class<T> clazz){
        this.entityClass=clazz;
    }

    public T loadById(ID id){
        return em.find(entityClass, id);
    }

    public ID add(T entity){
         em.persist(entity);
         return entity.getId();
    }

    public ID update(T entity){
        em.merge(entity);
        return entity.getId();
    }

    public ID delete(T entity){
        em.remove(entity);
        return entity.getId();
    }

}
