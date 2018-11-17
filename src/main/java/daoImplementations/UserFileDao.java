
package daoImplementations;


import dao.UserDao;
import java.util.List;
import models.User;
import org.springframework.stereotype.Repository;

@Repository("userFileDao")
public class UserFileDao extends FileAbstractDao<User> implements UserDao{

    public UserFileDao() {
        
    }

    @Override
    public String getDatasourceName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
