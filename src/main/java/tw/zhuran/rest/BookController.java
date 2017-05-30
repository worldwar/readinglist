package tw.zhuran.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.zhuran.entity.Book;
import tw.zhuran.repository.BookRepository;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("books")
    public Object books(Pageable pageable) {
        Page<Book> all = bookRepository.findAll(pageable);
        return all;
    }
}
