package uz.devs.test_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.devs.test_online.entity.UserTests;

public interface UserTestsRepository extends JpaRepository<UserTests, Integer> {
}
