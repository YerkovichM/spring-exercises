package ua.procamp.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.procamp.dao.CustomUserRepository;
import ua.procamp.model.jpa.Role;
import ua.procamp.model.jpa.RoleType;
import ua.procamp.model.jpa.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CustomUserRepositoryImpl implements CustomUserRepository {

	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void addRoleToAllUsers(RoleType roleType) {
		List<User> users = entityManager.createQuery("select u from User u left join fetch u.roles", User.class)
				.getResultList();
		users.stream()
				.filter(user -> hasNoRole(user, roleType))
				.forEach(user -> user.addRole(Role.valueOf(roleType)));
	}

	private boolean hasNoRole(User user, RoleType roleType) {
		return user.getRoles()
				.stream()
				.map(Role::getRoleType)
				.noneMatch(type -> type.equals(roleType));
	}
}
