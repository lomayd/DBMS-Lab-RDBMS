package lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.MssqlUser;
import lombok.*;

public class MssqlUserResponseDto {

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

        public static MssqlUserResponseDto.UserInfo of(MssqlUser mssqlUser) {
            return MssqlUserResponseDto.UserInfo.builder()
                    .id(mssqlUser.getId())
                    .password(mssqlUser.getPassword())
                    .name(mssqlUser.getName())
                    .nickname(mssqlUser.getNickname())
                    .email(mssqlUser.getEmail())
                    .age(mssqlUser.getAge())
                    .build();
        }
    }
}
