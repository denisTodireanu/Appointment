package appointment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import appointment.project.application.models.Credentials;

public interface CredentialsRepository extends JpaRepository<Credentials, Long> {
 
	Credentials findByUsername(String username);
}
