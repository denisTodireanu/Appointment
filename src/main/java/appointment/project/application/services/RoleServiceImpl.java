package appointment.project.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.project.repositories.RoleRepository;

@Service
public class RoleServiceImpl {

	@Autowired
	RoleRepository roleRepository;
}
