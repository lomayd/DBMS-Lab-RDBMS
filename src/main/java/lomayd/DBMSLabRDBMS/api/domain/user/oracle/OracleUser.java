package lomayd.DBMSLabRDBMS.api.domain.user.oracle;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="oracleuser",schema = "SYSTEM")
public class OracleUser {

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
