package org.delcom.ifs25031springboottodolist.domain.repository;

import org.delcom.ifs25031springboottodolist.domain.entity.User;

import java.util.Optional;

/**
 * Port penyimpanan pengguna.
 */
public interface IUserRepository extends IRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    User saveNew(String username, String passwordHash, String fullName, org.delcom.ifs25031springboottodolist.domain.entity.Role role);
}
