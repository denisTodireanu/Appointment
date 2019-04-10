package appointment.project.repositories;

import org.springframework.stereotype.Repository;

import appointment.project.application.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
