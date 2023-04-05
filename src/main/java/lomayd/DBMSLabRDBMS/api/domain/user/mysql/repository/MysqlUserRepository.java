package lomayd.DBMSLabRDBMS.api.domain.user.mysql.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.mysql.MysqlUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlUserRepository extends JpaRepository<MysqlUser, String> {
}
