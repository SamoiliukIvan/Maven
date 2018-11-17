/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.RoleDao;
import models.Role;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */
@Repository(value="roleDatabaseDao")
public class RoleDatabaseDao extends HibernateAbstractDao<Role> implements RoleDao{

    public RoleDatabaseDao() {
    }

    
    
}
