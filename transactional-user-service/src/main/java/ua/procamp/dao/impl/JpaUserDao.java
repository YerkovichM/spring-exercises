package ua.procamp.dao.impl;

import ua.procamp.dao.UserDao;
import ua.procamp.model.jpa.User;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * This class implements {@link UserDao} using JPA.
 * <p>
 * todo: 1. Configure {@link JpaUserDao} bean as Spring Repository with name "userDao"
 * todo: 2. Enable transaction management on class level
 * todo: 3. Inject persistence context into {@link EntityManager} field
 */
public class JpaUserDao implements UserDao {

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    @Override
    public User findById(long id) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }
}
