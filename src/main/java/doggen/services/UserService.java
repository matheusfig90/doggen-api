package doggen.services;

import doggen.models.User;
import doggen.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Create user
     *
     * @param name
     * @param email
     * @param password
     * @return User created
     */
    public User create(String name, String email, String password) {
        User newUser = new User(name, email, password);

        return userRepository.save(newUser);
    }
}
