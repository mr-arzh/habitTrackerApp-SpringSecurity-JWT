package com.habitTrackerApp.habitTrackerApp.repositary;

import com.habitTrackerApp.habitTrackerApp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class UserRepositary implements JpaRepository<UserEntity, Long> {
}
