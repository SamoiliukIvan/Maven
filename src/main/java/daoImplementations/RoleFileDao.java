/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.RoleDao;
import java.util.List;
import models.Role;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */

@Repository(value="roleFileDao")
public class RoleFileDao extends FileAbstractDao<Role> implements RoleDao{

    @Override
    public String getDatasourceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
