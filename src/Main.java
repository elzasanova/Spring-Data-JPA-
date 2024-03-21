import Autowired.Autowired;
import Entity.Entity;
import GeneratedValue.GeneratedValue;
import Id.Id;
import JpaRepository.JpaRepository;
import Service.Service;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

    // ...
}

public interface UserRepository extends JpaRepository<User, Long> {
    default void save(User user) {

    }
}

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

// ...
