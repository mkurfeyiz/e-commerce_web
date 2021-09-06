package com.mkurfeyiz.ecommerce_web.dao;

import com.mkurfeyiz.ecommerce_web.model.Users;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsersHibernateDao implements IUsersDao{

    private EntityManager usersManager;

    @Autowired
    public UsersHibernateDao(EntityManager usersManager){
        this.usersManager = usersManager;
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        String query = "from Users";
        Session userSession = usersManager.unwrap(Session.class);
        List<Users> users = userSession.createQuery(query, Users.class).getResultList();
        return users;
    }

    @Override
    public void createUser(Users user) {
        Session userSession = usersManager.unwrap(Session.class);
        userSession.saveOrUpdate(user);
    }

    @Override
    public void updateUser(Users user) {
        Session userSession = usersManager.unwrap(Session.class);
        userSession.saveOrUpdate(user);
    }

    @Override
    public void deleteUser(Users user) {
        Session userSession = usersManager.unwrap(Session.class);
        Users selectedUser = userSession.get(Users.class, user.getId());
        userSession.delete(selectedUser);
    }
}
