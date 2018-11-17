
package daoImplementations;

import dao.CountryDao;
import java.util.List;
import models.Country;
import org.springframework.stereotype.Repository;

@Repository(value="countryFileDao")
public class CountryFileDao extends FileAbstractDao<Country> implements CountryDao{

    @Override
    public String getDatasourceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Country> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Country getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
