package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.service;

import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto.PostgresqlUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.PostgresqlUser;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto.PostgresqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.repository.PostgresqlUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostgresqlUserService {

    private final PostgresqlUserRepository postgresqlUserRepository;

    public void postgresqlJoinUser(PostgresqlUserRequestDto.UserJoin userJoin){
        PostgresqlUser postgresqlUser = PostgresqlUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        postgresqlUserRepository.save(postgresqlUser);
    }
    public PostgresqlUserResponseDto.UserInfo postgresqlGetUser(String id) {
        PostgresqlUser postgresqlUser = postgresqlUserRepository.findById(id).get();

        return PostgresqlUserResponseDto.UserInfo.of(postgresqlUser);
    }

    public void postgresqlModifyUser(String id, PostgresqlUserRequestDto.UserModify userModify) {
        PostgresqlUser postgresqlUser = postgresqlUserRepository.findById(id).get();

        postgresqlUser.setPassword(userModify.getPassword());
        postgresqlUser.setName(userModify.getName());
        postgresqlUser.setNickname(postgresqlUser.getNickname());
        postgresqlUser.setEmail(postgresqlUser.getEmail());
        postgresqlUser.setAge(postgresqlUser.getAge());

        postgresqlUserRepository.save(postgresqlUser);
    }

    public void postgresqlRemoveUser(String id) {
        postgresqlUserRepository.deleteById(id);
    }
}
