package ua.procamp.service;

import ua.procamp.dao.UserDao;
import ua.procamp.model.jpa.Role;
import ua.procamp.model.jpa.RoleType;
import ua.procamp.model.jpa.User;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * This class proovides {@link User} related service logic.
 * <p>
 * todo: 1. Configure {@link UserService} bean as spring service
 * todo: 2. Inject {@link UserDao} using constructor-based injection
 * todo: 3. Enable transaction management on class level
 * todo: 4. Configure {@link UserService#getAll()} as read-only method
 * todo: 4. Configure {@link UserService#getAllAdmins()} as read-only method
 */
public class UserService {
    private UserDao userDao;

    public void save(User user) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    public List<User> getAll() {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    public List<User> getAllAdmins() {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }

    public void addRole(Long userId, RoleType roleType) {
        throw new UnsupportedOperationException("Keep calm and implement the method");
    }
}
