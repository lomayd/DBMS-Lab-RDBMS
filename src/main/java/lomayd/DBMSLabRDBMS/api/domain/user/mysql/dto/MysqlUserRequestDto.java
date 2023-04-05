package lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto;

import lombok.*;

public class MysqlUserRequestDto {

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserJoin {
        private String id;
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;
    }
}
