package com.db.aero.configserver.repositories;

import com.db.aero.configserver.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
