/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImplementations;

import dao.OrderDao;
import models.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ISamoiliuk
 */
@Repository(value="orderDatabaseDao")
public class OrderDatabaseDao extends HibernateAbstractDao<Order> implements OrderDao{

    public OrderDatabaseDao() {
    }

    
    
}
