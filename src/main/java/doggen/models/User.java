package doggen.models;

import org.springframework.data.annotation.Id;

import java.util.Objects;

/**
 * User model
 *
 * @author Matheus Figueredo <matheus.figueredo@gmail.com>
 */
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        User user = (User) obj;

        return Objects.equals(this.getId(), user.getId())
                && Objects.equals(this.getName(), user.getName())
                && Objects.equals(this.getEmail(), user.getEmail())
                && Objects.equals(this.getPassword(), user.getPassword());
    }
}