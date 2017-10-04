package doggen.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    private final String expectedName = "Doggen User";
    private final String expectedEmail = "user@doggen.com";
    private final String expectedPassword = "500o4a2719N730A5O5J";

    @Test
    public void shouldCreate() {
        User user = new User(expectedName, expectedEmail, expectedPassword);

        String actualName = user.getName();
        String actualEmail = user.getEmail();
        String actualPassword = user.getPassword();

        assertThat(actualName, equalTo(expectedName));
        assertThat(actualEmail, equalTo(expectedEmail));
        assertThat(actualPassword, equalTo(expectedPassword));
    }

    @Test
    public void shouldBeEquals() {
        User userA = new User(expectedName, expectedEmail, expectedPassword);
        User userB = new User(expectedName, expectedEmail, expectedPassword);

        assertThat(userA.equals(userB), equalTo(true));
    }

    @Test
    public void shouldBeNotEquals() {
        User userA = new User(expectedName, expectedEmail, expectedPassword);
        User userB = new User("User", expectedEmail, expectedPassword);

        assertThat(userA.equals(userB), equalTo(false));
    }
}
