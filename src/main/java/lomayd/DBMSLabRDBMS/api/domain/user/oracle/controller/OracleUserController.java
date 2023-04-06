package lomayd.DBMSLabRDBMS.api.domain.user.oracle.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto.OracleUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.oracle.dto.OracleUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.oracle.service.OracleUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/oracle")
    public ResponseEntity<OracleUserResponseDto.UserInfo> oracleGetUser(@RequestParam String id) {
        return ResponseEntity.ok(oracleUserService.oracleGetUser(id));
    }

    @PatchMapping("/oracle")
    public ResponseEntity<Void> oracleModifyUser(@RequestParam String id, @RequestBody OracleUserRequestDto.UserModify userModify) {
        oracleUserService.oracleModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/oracle")
    public ResponseEntity<Void> oracleRemoveUser(@RequestParam String id) {
        oracleUserService.oracleRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
