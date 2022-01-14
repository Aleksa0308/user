package raf.com.sk.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raf.com.sk.user.domain.Role;

import java.util.Optional;

public interface RolerRepository extends JpaRepository<Role, Long> {
    Optional<Role> findRoleByName(String name);
}
