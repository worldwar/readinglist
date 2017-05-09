package tw.zhuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.zhuran.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findByTitle(String title);
    Book findById(String id);
}
