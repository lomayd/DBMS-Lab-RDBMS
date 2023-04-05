package lomayd.DBMSLabRDBMS.api.domain.user.mssql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.service.MssqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class MssqlUserController {

    private final MssqlUserService mssqlUserService;

    @PostMapping("/mssql")
    public ResponseEntity<Void> mssqlJoinUser(@RequestBody MssqlUserRequestDto.UserJoin userJoin) {
        mssqlUserService.mssqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }
}
