package org.jzy.bookmanager.dao;

import org.jzy.bookmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    User findByUserName(String username);

    User findByUserNameAndPassword(String username, String password);
}
