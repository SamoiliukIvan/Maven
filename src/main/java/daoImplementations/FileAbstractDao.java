/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import daoAccessors.FileDatasourceAccessor;
import models.Model;

/**
 *
 * @author ISamoiliuk
 */
public abstract class FileAbstractDao<T extends Model> extends FileDatasourceAccessor {

   public void add(T model){
       
   }
   
   public void update(T model) {
       
   }
   
   public void remove(T model) {
       
   }
    
}
