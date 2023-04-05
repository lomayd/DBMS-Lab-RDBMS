package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.service;

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
}
