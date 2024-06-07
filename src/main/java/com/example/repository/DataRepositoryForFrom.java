package com.example.repository;

import com.example.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface DataRepositoryForFrom extends JpaRepository<Form, Long>
{

}
