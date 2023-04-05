package lomayd.DBMSLabRDBMS.api.domain.user.oracle.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto.OracleUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.oracle.service.OracleUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class OracleUserController {

    private final OracleUserService oracleUserService;

    @PostMapping("/oracle")
    public ResponseEntity<Void> oracleJoinUser(@RequestBody OracleUserRequestDto.UserJoin userJoin) {
        oracleUserService.oracleJoinUser(userJoin);
        return ResponseEntity.ok().build();
    }
}
