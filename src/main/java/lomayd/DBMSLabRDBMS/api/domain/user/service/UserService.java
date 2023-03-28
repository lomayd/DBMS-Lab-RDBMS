package lomayd.DBMSLabRDBMS.api.domain.user.service;

import lomayd.DBMSLabRDBMS.api.domain.user.User;
import lomayd.DBMSLabRDBMS.api.domain.user.dto.UserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.repository.MssqlUserRepository;
import lomayd.DBMSLabRDBMS.api.domain.user.repository.MysqlUserRepository;
import lomayd.DBMSLabRDBMS.api.domain.user.repository.OracleUserRepository;
import lomayd.DBMSLabRDBMS.api.domain.user.repository.PostgresqlUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final OracleUserRepository oracleUserRepository;
    private final MysqlUserRepository mysqlUserRepository;
    private final MssqlUserRepository mssqlUserRepository;
    private final PostgresqlUserRepository postgresqlUserRepository;

    public void oracleJoinUser(UserRequestDto.UserJoin userJoin){
        User user = User.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        oracleUserRepository.save(user);
    }

    public void mysqlJoinUser(UserRequestDto.UserJoin userJoin){
        User user = User.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        mysqlUserRepository.save(user);
    }

    public void mssqlJoinUser(UserRequestDto.UserJoin userJoin){
        User user = User.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        mssqlUserRepository.save(user);
    }

    public void postgresqlJoinUser(UserRequestDto.UserJoin userJoin){
        User user = User.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        postgresqlUserRepository.save(user);
    }
}
