package lomayd.DBMSLabRDBMS.api.domain.user.mssql.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.mssql.MssqlUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MssqlUserRepository extends JpaRepository<MssqlUser, String> {
}
