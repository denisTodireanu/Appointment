package appointment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import appointment.project.application.models.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

}
