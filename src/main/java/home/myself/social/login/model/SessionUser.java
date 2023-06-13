package home.myself.social.login.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

    public SessionUser() {
    }
}