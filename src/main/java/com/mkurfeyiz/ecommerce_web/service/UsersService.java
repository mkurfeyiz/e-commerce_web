package com.mkurfeyiz.ecommerce_web.service;

import com.mkurfeyiz.ecommerce_web.dao.IUsersDao;
import com.mkurfeyiz.ecommerce_web.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersService implements IUsersService{

    private IUsersDao usersDao;

    @Autowired
    public UsersService(IUsersDao usersDao){
        this.usersDao = usersDao;
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return this.usersDao.getAllUsers();
    }

    @Override
    @Transactional
    public void createUser(Users user) {

        this.usersDao.createUser(user);

    }

    @Override
    @Transactional
    public void updateUser(Users user) {
        this.usersDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Users user) {
        this.usersDao.deleteUser(user);
    }

}
