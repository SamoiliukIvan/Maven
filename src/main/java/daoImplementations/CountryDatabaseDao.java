
package daoImplementations;

import dao.CountryDao;
import models.Country;
import org.springframework.stereotype.Repository;

@Repository(value="countryDatabaseDao")
public class CountryDatabaseDao extends HibernateAbstractDao<Country> implements CountryDao{

    public CountryDatabaseDao() {
    }
    
}
