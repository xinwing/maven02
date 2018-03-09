package com.itgg.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itgg.dao.UserDao;
import com.itgg.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:01:08 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    
    @Override
    public User findUserById(Integer id) {
        User user = getHibernateTemplate().get(User.class, id);
        return user;
    }

}
  
