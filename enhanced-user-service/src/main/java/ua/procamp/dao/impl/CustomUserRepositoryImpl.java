package ua.procamp.dao.impl;

import org.springframework.stereotype.Repository;
import ua.procamp.dao.CustomUserRepository;
import ua.procamp.model.jpa.Role;
import ua.procamp.model.jpa.RoleType;
import ua.procamp.model.jpa.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CustomUserRepositoryImpl implements CustomUserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addRoleToAllUsers(RoleType roleType) {
        entityManager.createQuery("select u from User u", User.class)
                .getResultList().stream()
                .filter(user -> !hasRole(user, roleType))
                .forEach(user -> user.addRole(Role.valueOf(roleType)));
    }

    private boolean hasRole(User user, RoleType roleType) {
        return user.getRoles().stream().anyMatch(role -> role.getRoleType().equals(roleType));
    }
}
