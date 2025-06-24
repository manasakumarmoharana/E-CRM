package in.mk.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mk.main.entities.User;

public interface CustomerRepository extends JpaRepository<User, Long> 
{
	User findByEmail(String email);
}
