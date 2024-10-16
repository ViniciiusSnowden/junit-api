package com.api_unit.junit_pai.services.repositores;

import com.api_unit.junit_pai.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    ;

}
