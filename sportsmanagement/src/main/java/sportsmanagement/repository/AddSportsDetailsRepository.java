package sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sportsmanagement.model.AddSportsDeatails;

@Repository
public interface AddSportsDetailsRepository extends JpaRepository<AddSportsDeatails, String> {

}
