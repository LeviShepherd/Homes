/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package homes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homes.beans.Homes;

@Repository
public interface HomesRepository extends JpaRepository<Homes, Long> {

}
