package research.msa.security.experiment.oauth2.authentication.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    @Transactional
    User findByName(String name);

}
