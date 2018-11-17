
package daoImplementations;

import dao.HotelDao;
import models.Hotel;
import org.springframework.stereotype.Repository;

@Repository(value="hotelDatabaseDao")
public class HotelDatabaseDao extends HibernateAbstractDao<Hotel> implements HotelDao{

    public HotelDatabaseDao() {
    }
    
}
