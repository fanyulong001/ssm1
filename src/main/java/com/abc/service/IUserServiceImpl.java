package com.abc.service;

import com.abc.beans.User;
import com.abc.dao.IUserdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService{
    @Autowired
private IUserdao userdao;

    @Override
    public void addUser(User user) {
           userdao.insertUser(user);
    }
}
