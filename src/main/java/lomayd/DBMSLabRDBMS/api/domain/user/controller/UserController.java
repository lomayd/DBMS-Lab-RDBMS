package lomayd.DBMSLabRDBMS.api.domain.user.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.dto.UserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/oracle")
    public ResponseEntity<Void> oracleJoinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.oracleJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/mysql")
    public ResponseEntity<Void> mysqlJoinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.mysqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/mssql")
    public ResponseEntity<Void> mssqlJoinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.mssqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/postgresql")
    public ResponseEntity<Void> postgresqlJoinUser(@RequestBody UserRequestDto.UserJoin userJoin) {
        userService.postgresqlJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }
}
