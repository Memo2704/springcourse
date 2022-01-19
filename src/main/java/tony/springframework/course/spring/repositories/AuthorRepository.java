package tony.springframework.course.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import tony.springframework.course.spring.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
