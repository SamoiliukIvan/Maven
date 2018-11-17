/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.TourDao;
import java.util.List;
import models.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ISamoiliuk
 */

@Service(value = "tourService")
public class TourService {
    @Autowired
    @Qualifier("tourDatabaseDao")
    private TourDao tourDao;

    public TourService() {
    }
    
    public List<Tour> getAll() {
        return tourDao.getAll();
    }
    
}
