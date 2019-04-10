package appointment.project.application.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import appointment.project.application.DTOs.UserDTO;
import appointment.project.application.models.User;
import appointment.project.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	 private UserRepository userRepository;
	
	@RequestMapping("/test")
	public UserDTO getUserTest() {
		return new UserDTO();
	}
	
	@GetMapping("/test2")
	public UserDTO getUserTest2() {
		return new UserDTO();
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public User create(@RequestBody User user) {
		
		return userRepository.save(user);
		
	}
	
	@PostMapping("/testPost")
	@ResponseStatus(HttpStatus.OK)
	public User create() {
		
		return new User();
		
	}
	
	@GetMapping("/{id}")
	public Optional<User> get(@PathVariable("id") Long id) {
		//return new UserDTO();
		return userRepository.findById(id);
	}
}
