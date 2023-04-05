package lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto;

import lombok.*;

public class MssqlUserRequestDto {

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
