package com.seawater.dao;

import org.springframework.data.repository.CrudRepository;

import com.seawater.bean.User;
  
/** 
 * Created by zhouhs on 2016/12/30. 
 */  
public interface UserDao extends CrudRepository<User, Long> {  
  
    public User findById(Long id);  
  
}  