package tony.springframework.course.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import tony.springframework.course.spring.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
