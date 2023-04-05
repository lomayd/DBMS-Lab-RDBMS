package lomayd.DBMSLabRDBMS.api.domain.user.postgresql.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.postgresql.PostgresqlUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostgresqlUserRepository extends JpaRepository<PostgresqlUser, String> {
}
