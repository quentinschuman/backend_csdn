package com.zjgsu.backend.service;

import com.zjgsu.backend.dao.UserDao;
import com.zjgsu.backend.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/29
 * Time: 10:24
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean find(String username,String password){
        boolean b= true;
        List<UserBean> all = userDao.findAll();
        System.out.println(all);
        for (int i=0;i<all.size();i++){
            UserBean one = all.get(i);
            if (username.equals(one.getUsername())&&password.equals(one.getPassword())){
                b=true;
                break;
            }else{
                b=false;
                break;
            }
        }
        return b;
    }
}