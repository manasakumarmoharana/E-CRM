package in.mk.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.mk.main.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	User findByEmail(String email);

}

