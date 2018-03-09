package com.itgg.web;

import com.itgg.domain.User;
import com.itgg.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:02:53 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    
    private User model=new User();
    private UserService userService;
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    @Override
    public User getModel() {
          
        return model;
    }
    public void setModel(User model) {
        this.model = model;
    }
    
    public String findUserById(){
        model=userService.findUserById(model.getId());
        if(model!=null){
            return SUCCESS;
        }
        return NONE;
    }
    
}
  
