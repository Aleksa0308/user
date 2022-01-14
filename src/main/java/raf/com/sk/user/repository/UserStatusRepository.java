package raf.com.sk.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raf.com.sk.user.domain.UserStatus;

public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
}
