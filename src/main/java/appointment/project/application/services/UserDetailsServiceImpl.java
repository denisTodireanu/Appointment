package appointment.project.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import appointment.project.application.DTOs.MyUserPrincipal;
import appointment.project.application.models.Credentials;
import appointment.project.repositories.CredentialsRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private CredentialsRepository credentialsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		Credentials credential = credentialsRepository.findByUsername(username);
		if (credential == null) {
			throw new UsernameNotFoundException(username);
		}
		return new MyUserPrincipal(credential);
	}
}
