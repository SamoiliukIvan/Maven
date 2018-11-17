/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.RegionDao;
import dao.RoleDao;
import models.Region;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */
@Repository(value="regionDatabaseDao")
public class RegionDatabaseDao extends HibernateAbstractDao<Region> implements RegionDao{
    
}
