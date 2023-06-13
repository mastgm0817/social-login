package home.myself.social.login.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String email;
    private String picture;
    private String role = "ROLE_USER";

    public User() {
        // 기본 생성자
    }


    public User(String name, String email, String picture) {
        this.name = name;
        this.email = email;
        this.picture = picture;
    }
    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

}
