package tony.springframework.course.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tony.springframework.course.spring.domain.Author;
import tony.springframework.course.spring.domain.Book;
import tony.springframework.course.spring.domain.Publisher;
import tony.springframework.course.spring.repositories.AuthorRepository;
import tony.springframework.course.spring.repositories.BookRepository;
import tony.springframework.course.spring.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain driven design", "123456");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Jonhson");
        Book noEJB = new Book("J2EE", "1231231");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher planeta = new Publisher("Zabala 3556", "CABA", "Buenos Aires", "1427");
        planeta.getBooks().add(ddd);
        planeta.getBooks().add(noEJB);
        publisherRepository.save(planeta);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher number of books: " + planeta.getBooks().size());


    }
}
