package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto.PostgresqlUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.dto.PostgresqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.service.PostgresqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/postgresql")
    public ResponseEntity<PostgresqlUserResponseDto.UserInfo> postgresqlGetUser(@RequestParam String id) {
        return ResponseEntity.ok(postgresqlUserService.postgresqlGetUser(id));
    }

    @PatchMapping("/postgresql")
    public ResponseEntity<Void> postgresqlModifyUser(@RequestParam String id, @RequestBody PostgresqlUserRequestDto.UserModify userModify) {
        postgresqlUserService.postgresqlModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/postgresql")
    public ResponseEntity<Void> postgresqlRemoveUser(@RequestParam String id) {
        postgresqlUserService.postgresqlRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
