package lomayd.DBMSLabRDBMS.api.domain.user.oracle.service;

import lomayd.DBMSLabRDBMS.api.domain.user.oracle.OracleUser;
import lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto.OracleUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.oracle.repository.OracleUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OracleUserService {

    private final OracleUserRepository oracleUserRepository;

    public void oracleJoinUser(OracleUserRequestDto.UserJoin userJoin){
        OracleUser oracleUser = OracleUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        oracleUserRepository.save(oracleUser);
    }
}
