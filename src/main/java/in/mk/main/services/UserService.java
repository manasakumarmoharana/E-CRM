package in.mk.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mk.main.entities.User;
import in.mk.main.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	
	public void registerUserService(User user)
	{
		userRepository.save(user);
	}
	
	@SuppressWarnings("null")
	public boolean loginUserService(String email, String password)
	{
		User user = userRepository.findByEmail(email);
		if(user != null)
		{
			return password.equals(user.getPassword());
		}
		if(Boolean.TRUE.equals(user.isBanStatus())) {
		    throw new RuntimeException("User is Banned");
		}

		return false;
	}
}
