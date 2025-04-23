package thales.carrion.calculoservico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thales.carrion.calculoservico.DTO.UserDTO;
import thales.carrion.calculoservico.entities.User;
import thales.carrion.calculoservico.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User createUser(UserDTO userDTO) {
		User user = new User();
	    user.setUsername(userDTO.getUsername());
	    user.setEmail(userDTO.getEmail());
	    user.setPassword(userDTO.getPassword());

	    return userRepository.save(user);
    }
	
	/*public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}*/
    
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
