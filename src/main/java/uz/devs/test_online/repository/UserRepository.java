package uz.devs.test_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.devs.test_online.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
