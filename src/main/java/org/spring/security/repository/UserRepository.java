package org.spring.security.repository;

import org.spring.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
	//@Query(value= "SELECT u FROM User u WHERE u.username = ?1", nativeQuery = true)
    User findByUsername(String username);
}
