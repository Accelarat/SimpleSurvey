package com.simplesurvey.repository;

import com.simplesurvey.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Students, Long>, CrudRepository<Students, Long> {

}
