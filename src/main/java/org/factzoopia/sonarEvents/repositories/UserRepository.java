package org.factzoopia.sonarEvents.repositories;
import java.util.Optional;



import org.factzoopia.sonarEvents.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String username);


}
