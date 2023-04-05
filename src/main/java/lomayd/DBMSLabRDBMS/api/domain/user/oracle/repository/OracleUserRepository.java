package lomayd.DBMSLabRDBMS.api.domain.user.oracle.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.oracle.OracleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OracleUserRepository extends JpaRepository<OracleUser, String> {
}
