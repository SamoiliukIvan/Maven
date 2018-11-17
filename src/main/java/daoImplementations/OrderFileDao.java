/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.OrderDao;
import java.sql.SQLException;
import java.util.List;
import models.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */

@Repository(value="orderFileDao")
public class OrderFileDao extends FileAbstractDao<Order> implements OrderDao{

    public OrderFileDao() {
    }


    @Override
    public String getDatasourceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
