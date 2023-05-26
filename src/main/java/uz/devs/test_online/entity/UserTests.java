package uz.devs.test_online.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTests {
    @Id
    @GeneratedValue(generator = "userTests")
    @SequenceGenerator(name = "userTests", sequenceName = "user_tests_seq", allocationSize = 1)
    private Integer id;
    private Integer userId;
    private Integer fanId;
    private Integer testCount;
    private Integer correctAnswers;
    private Float percentage;

}
