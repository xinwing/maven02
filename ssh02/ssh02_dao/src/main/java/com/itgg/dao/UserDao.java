package com.itgg.dao;

import com.itgg.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午2:59:56 <br/>       
 */
public interface UserDao {

    User findUserById(Integer id);
    
}
  
