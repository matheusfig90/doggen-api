package doggen.services;

import doggen.models.User;
import doggen.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void shouldCreateUser() {
        String name = "Doggen User";
        String email = "user@doggen.com";
        String password = "123789";

        User expectedUser = new User(name, email, password);

        when(userRepository.save(any(User.class))).thenReturn(expectedUser);

        User actualUser = userService.create(name, email, password);

        assertThat(actualUser, equalTo(expectedUser));

        verify(userRepository).save(expectedUser);
    }

}
