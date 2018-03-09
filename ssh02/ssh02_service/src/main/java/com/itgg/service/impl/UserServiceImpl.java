package com.itgg.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.itgg.dao.UserDao;
import com.itgg.domain.User;
import com.itgg.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:02:09 <br/>       
 */
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User findUserById(Integer id) {
        User user = userDao.findUserById(id);
        return user;
    }

}
  
