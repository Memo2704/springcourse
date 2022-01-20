package tony.springframework.course.spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tony.springframework.course.spring.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/books/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "books/aulist";
    }
}
