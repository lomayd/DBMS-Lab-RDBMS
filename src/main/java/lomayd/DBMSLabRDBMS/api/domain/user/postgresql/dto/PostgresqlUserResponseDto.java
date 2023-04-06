package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto;

import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.PostgresqlUser;
import lombok.*;

public class PostgresqlUserResponseDto {
    
    @Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserInfo {
        private String id;
        private String password;
        private String name;
        private String nickname;
        private String email;
        private Integer age;

        public static PostgresqlUserResponseDto.UserInfo of(PostgresqlUser postgresqlUser) {
            return PostgresqlUserResponseDto.UserInfo.builder()
                    .id(postgresqlUser.getId())
                    .password(postgresqlUser.getPassword())
                    .name(postgresqlUser.getName())
                    .nickname(postgresqlUser.getNickname())
                    .email(postgresqlUser.getEmail())
                    .age(postgresqlUser.getAge())
                    .build();
        }
    }
}
