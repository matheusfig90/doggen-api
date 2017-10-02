package doggen.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Test
    public void creatingUser() {
        String expectedName = "Doggen User";
        String expectedEmail = "user@doggen.com";
        String expectedPassword = "500o4a2719N730A5O5J";

        User user = new User(expectedName, expectedEmail, expectedPassword);

        String actualName = user.getName();
        String actualEmail = user.getEmail();
        String actualPassword = user.getPassword();

        assertThat(actualName).isEqualTo(expectedName);
        assertThat(actualEmail).isEqualTo(expectedEmail);
        assertThat(actualPassword).isEqualTo(expectedPassword);
    }

}
