package lomayd.DBMSLabRDBMS.api.domain.user.mysql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto.MysqlUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto.MysqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mysql.service.MysqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class MysqlUserController {

    private final MysqlUserService mysqlUserService;

    @PostMapping("/mysql")
    public ResponseEntity<Void> mysqlJoinUser(@RequestBody MysqlUserRequestDto.UserJoin userJoin) {
        mysqlUserService.mysqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/mysql")
    public ResponseEntity<MysqlUserResponseDto.UserInfo> mysqlGetUser(@RequestParam String id) {
        return ResponseEntity.ok(mysqlUserService.mysqlGetUser(id));
    }

    @PatchMapping("/mysql")
    public ResponseEntity<Void> mysqlModifyUser(@RequestParam String id, @RequestBody MysqlUserRequestDto.UserModify userModify) {
        mysqlUserService.mysqlModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/mysql")
    public ResponseEntity<Void> mysqlRemoveUser(@RequestParam String id) {
        mysqlUserService.mysqlRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
