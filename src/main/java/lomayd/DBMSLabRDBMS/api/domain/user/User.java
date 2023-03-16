package lomayd.DBMSLabRDBMS.api.domain.user;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private String id;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String nickname;

    @Column
    private String email;

    @Column
    private Integer age;
}
