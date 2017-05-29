package tw.zhuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.zhuran.entity.Chapter;

import java.util.List;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    List<Chapter> findByBookId(String bookId);
    List<Chapter> findByVolumeId(String volumeId);
    Chapter findById(String id);
}
