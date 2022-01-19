package tony.springframework.course.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import tony.springframework.course.spring.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
