/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.TourDao;
import models.Tour;
import models.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */
@Repository(value="tourDatabaseDao")
public class TourDatabaseDao extends HibernateAbstractDao<Tour> implements TourDao{

   
    
}
