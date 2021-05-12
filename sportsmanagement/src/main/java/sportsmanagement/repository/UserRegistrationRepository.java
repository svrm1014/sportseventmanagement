package sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sportsmanagement.model.UserRegistrationForm;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationForm, String> {

}
