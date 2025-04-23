package thales.carrion.calculoservico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thales.carrion.calculoservico.DTO.UserDTO;
import thales.carrion.calculoservico.entities.User;
import thales.carrion.calculoservico.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserControlller {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserDTO user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }
}
