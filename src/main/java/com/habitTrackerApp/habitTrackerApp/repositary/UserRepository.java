package com.habitTrackerApp.habitTrackerApp.repositary;

import com.habitTrackerApp.habitTrackerApp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.habitTrackerApp.habitTrackerApp.*;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findUserByUsername(String username);
    UserEntity findUserByEmail(String email);



}
