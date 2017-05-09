package tw.zhuran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.zhuran.entity.Volume;

import java.util.List;

public interface VolumeRepository extends JpaRepository<Volume, Long> {
    List<Volume> findByBookId(String bookId);
}
