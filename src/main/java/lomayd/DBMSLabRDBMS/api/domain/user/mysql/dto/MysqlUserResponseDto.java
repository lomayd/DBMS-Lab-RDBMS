package lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto;

import lomayd.DBMSLabRDBMS.api.domain.user.mysql.MysqlUser;
import lombok.*;

public class MysqlUserResponseDto {

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

        public static MysqlUserResponseDto.UserInfo of(MysqlUser mysqlUser) {
            return MysqlUserResponseDto.UserInfo.builder()
                    .id(mysqlUser.getId())
                    .password(mysqlUser.getPassword())
                    .name(mysqlUser.getName())
                    .nickname(mysqlUser.getNickname())
                    .email(mysqlUser.getEmail())
                    .age(mysqlUser.getAge())
                    .build();
        }
    }
}
