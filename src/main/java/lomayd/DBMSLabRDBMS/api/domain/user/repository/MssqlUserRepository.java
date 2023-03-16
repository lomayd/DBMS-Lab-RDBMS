package lomayd.DBMSLabRDBMS.api.domain.user.repository;

import lomayd.DBMSLabRDBMS.api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MssqlUserRepository extends JpaRepository<User, String> {
}
