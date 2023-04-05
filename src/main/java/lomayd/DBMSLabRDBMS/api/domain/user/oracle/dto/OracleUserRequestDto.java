package lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto;

import lombok.*;

public class OracleUserRequestDto {

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
