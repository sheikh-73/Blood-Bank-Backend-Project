package com.example.repository;

import com.example.entities.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface DataRepository extends JpaRepository<PersonalInformation, Long>
{
    List<PersonalInformation> findByBloodGrp(String bloodGrp);
    PersonalInformation findByPhoneNumber(String phoneNumber);
}
