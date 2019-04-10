package appointment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import appointment.project.application.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
