package lomayd.DBMSLabRDBMS.api.domain.user.mssql.service;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.MssqlUser;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.repository.MssqlUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MssqlUserService {

    private final MssqlUserRepository mssqlUserRepository;

    public void mssqlJoinUser(MssqlUserRequestDto.UserJoin userJoin) {
        MssqlUser mssqlUser = MssqlUser.builder()
                .id(userJoin.getId())
                .password(userJoin.getPassword())
                .name(userJoin.getName())
                .nickname(userJoin.getNickname())
                .email(userJoin.getEmail())
                .age(userJoin.getAge())
                .build();

        mssqlUserRepository.save(mssqlUser);
    }
}
