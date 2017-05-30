package tw.zhuran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tw.zhuran.repository.BookRepository;

@Controller
@RequestMapping("/")
public class IndexController {
    private BookRepository bookRepository;

    @Autowired
    public IndexController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

}
