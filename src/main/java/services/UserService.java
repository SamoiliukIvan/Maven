
package services;

import dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

public class UserService {
    
    @Autowired
    @Qualifier(value="userFileDao")
    private UserDao userDao;
    
    public UserService() {
        
    }
    
    @Transactional
    public List<User> getAll() throws SQLException {
        return userDao.getAll();
    }
}
