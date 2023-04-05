package lomayd.DBMSLabRDBMS.api.domain.user.mysql.service;

import lomayd.DBMSLabRDBMS.api.domain.user.mysql.MysqlUser;
import lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto.MysqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mysql.repository.MysqlUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MysqlUserService {

    private final MysqlUserRepository mysqlUserRepository;

    public void mysqlJoinUser(MysqlUserRequestDto.UserJoin userJoin){
        MysqlUser mysqlUser = MysqlUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        mysqlUserRepository.save(mysqlUser);
    }
}
