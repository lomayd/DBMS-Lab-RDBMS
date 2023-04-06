package lomayd.DBMSLabRDBMS.api.domain.user.mssql.controller;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserRequestDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.dto.MssqlUserResponseDto;
import lomayd.DBMSLabRDBMS.api.domain.user.mssql.service.MssqlUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/mssql")
    public ResponseEntity<MssqlUserResponseDto.UserInfo> mssqlGetUser(@RequestParam String id) {
        return ResponseEntity.ok(mssqlUserService.mssqlGetUser(id));
    }

    @PatchMapping("/mssql")
    public ResponseEntity<Void> mssqlModifyUser(@RequestParam String id, @RequestBody MssqlUserRequestDto.UserModify userModify) {
        mssqlUserService.mssqlModifyUser(id, userModify);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/mssql")
    public ResponseEntity<Void> mssqlRemoveUser(@RequestParam String id) {
        mssqlUserService.mssqlRemoveUser(id);
        return ResponseEntity.ok().build();
    }
}
