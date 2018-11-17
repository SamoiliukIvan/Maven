
package dao;


import daoAccessors.FileDatasourceAccessor;
import models.Model;

public abstract class FileModelDao <T extends Model> extends FileDatasourceAccessor{
    
public void remove(Long id) {
    
}
public void remove(T model) {
    this.remove(model.getId());
}
    
}
