package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto;

import lombok.*;

public class PostgresqlUserRequestDto {

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

    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserModify {
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;
    }
}
