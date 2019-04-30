package ua.procamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.procamp.dao.UserRepository;
import ua.procamp.exception.EntityNotFoundException;
import ua.procamp.model.jpa.RoleType;
import ua.procamp.model.jpa.User;

import java.util.List;

/**
 * This class provides service logic for {@link User}.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Implement {@link UserService#findByCity(String)} using {@link UserRepository}, make method read only
 * todo: 2. Implement {@link UserService#getByEmail(String)} using {@link UserRepository}, make method read only
 * todo: 3. In case user is not found by email, throw {@link EntityNotFoundException} with message "Cannot find user by email ${email}"
 * todo: 4. Implement {@link UserService#addRoleToAllUsers(RoleType)} using {@link UserRepository}
 */
@Service
public class UserService {

    final
    UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<User> findByCity(String city) {
        return repository.findAllByAddressCity(city);
    }

    @Transactional(readOnly = true)
    public User getByEmail(final String email) {
        return repository.findByEmailFetchRoles(email)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find user by email " + email));
    }

    public void addRoleToAllUsers(RoleType roleType) {
        repository.addRoleToAllUsers(roleType);
    }
}
