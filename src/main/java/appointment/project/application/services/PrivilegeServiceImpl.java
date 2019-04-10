package appointment.project.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appointment.project.repositories.PrivilegeRepository;

@Service
public class PrivilegeServiceImpl {
	@Autowired
	PrivilegeRepository privilegeRepository;
}
