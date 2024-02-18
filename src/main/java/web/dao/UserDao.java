package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.User;

import javax.persistence.EntityManager;

@Service
public class UserDao {
    @Autowired
    private EntityManager entityManager;

    public void Create() {
        entityManager.persist(new User("Petya"));
    }

}
