package ua.procamp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface represents a data access object (DAO) for {@link User}.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Configure {@link UserRepository} as {@link JpaRepository} for class User
 * todo: 2. Create method that finds a list of Users by address city using Spring Data method name convention
 * todo: 3. Create method that finds optional user by email fetching its address and roles using {@link org.springframework.data.jpa.repository.Query}
 * todo: 4. Add custom User repository interface
 */
public interface UserRepository extends JpaRepository {

}
