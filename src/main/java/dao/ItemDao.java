/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Model;
import models.User;

/**
 *
 * @author ISamoiliuk
 * @param <T>
 */
public interface ItemDao<T extends Model>{
    
    public void add(T model);

    public List<T> getAll();

    public T getById(Long id);

    public void update(T entity);

    public void remove(T model);
}
