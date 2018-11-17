/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;


import java.lang.reflect.ParameterizedType;
import java.util.List;
import models.Model;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author ISamoiliuk
 * @param <T>
 */
public abstract class HibernateAbstractDao<T extends Model> {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Class<T> clazz;
    
    @SuppressWarnings("unchecked")
    public HibernateAbstractDao() {
        final ParameterizedType superClass = (ParameterizedType)getClass().getGenericSuperclass();
        this.clazz = (Class<T>)((ParameterizedType) superClass).getActualTypeArguments()[0];
    }
    
    

    @SuppressWarnings("unchecked")
    public List<T> getAll(){
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    public T getById(Long id) {
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.add(Restrictions.eq("id", id));
        return (T)criteria.uniqueResult();
    }

    public void add(T model){
        getSession().save(model);
    }
    
    public void update(T model) {
        getSession().merge(model);
    }

    public void remove(T model) {
       getSession().delete(model);
    }
    
    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
}