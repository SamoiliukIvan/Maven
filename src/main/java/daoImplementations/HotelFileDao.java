
package daoImplementations;

import dao.HotelDao;
import java.sql.SQLException;
import java.util.List;
import models.Hotel;
import org.springframework.stereotype.Repository;

@Repository("hotelFileDao")
public class HotelFileDao extends FileAbstractDao<Hotel> implements HotelDao{

    public HotelFileDao() {
    }

    @Override
    public String getDatasourceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Hotel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hotel getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
