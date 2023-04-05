package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto.PostgresqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.service.PostgresqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class PostgresqlUserController {

    private final PostgresqlUserService postgresqlUserService;

    @PostMapping("/postgresql")
    public ResponseEntity<Void> postgresqlJoinUser(@RequestBody PostgresqlUserRequestDto.UserJoin userJoin) {
        postgresqlUserService.postgresqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }
}
