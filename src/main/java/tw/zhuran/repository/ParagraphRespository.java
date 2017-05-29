package tw.zhuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.zhuran.entity.Paragraph;

public interface ParagraphRespository extends JpaRepository<Paragraph, Long> {
    Paragraph findById(String id);
}
