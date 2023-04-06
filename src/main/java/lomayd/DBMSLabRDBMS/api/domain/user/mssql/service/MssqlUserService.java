package lomayd.DBMSLabRDBMS.api.domain.user.mssql.service;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.MssqlUser;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.repository.MssqlUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public MssqlUserResponseDto.UserInfo mssqlGetUser(String id) {
        MssqlUser mssqlUser = mssqlUserRepository.findById(id).get();

        return MssqlUserResponseDto.UserInfo.of(mssqlUser);
    }

    public void mssqlModifyUser(String id, MssqlUserRequestDto.UserModify userModify) {
        MssqlUser mssqlUser = mssqlUserRepository.findById(id).get();

        mssqlUser.setPassword(userModify.getPassword());
        mssqlUser.setName(userModify.getName());
        mssqlUser.setNickname(mssqlUser.getNickname());
        mssqlUser.setEmail(mssqlUser.getEmail());
        mssqlUser.setAge(mssqlUser.getAge());

        mssqlUserRepository.save(mssqlUser);
    }

    public void mssqlRemoveUser(String id) {
        mssqlUserRepository.deleteById(id);
    }
}
