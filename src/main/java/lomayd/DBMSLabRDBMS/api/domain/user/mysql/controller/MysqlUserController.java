package lomayd.DBMSLabRDBMS.api.domain.user.mysql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.mysql.dto.MysqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mysql.service.MysqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
