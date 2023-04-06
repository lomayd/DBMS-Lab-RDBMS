package lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto;

import lomayd.DBMSLabRDBMS.api.domain.user.oracle.OracleUser;
import lombok.*;

public class OracleUserResponseDto {

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

        public static OracleUserResponseDto.UserInfo of(OracleUser oracleUser) {
            return OracleUserResponseDto.UserInfo.builder()
                    .id(oracleUser.getId())
                    .password(oracleUser.getPassword())
                    .name(oracleUser.getName())
                    .nickname(oracleUser.getNickname())
                    .email(oracleUser.getEmail())
                    .age(oracleUser.getAge())
                    .build();
        }
    }
}
