package tw.zhuran.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.zhuran.entity.Book;
import tw.zhuran.entity.Chapter;
import tw.zhuran.entity.Volume;
import tw.zhuran.repository.BookRepository;
import tw.zhuran.repository.ChapterRepository;
import tw.zhuran.repository.VolumeRepository;
import tw.zhuran.vo.BookVO;
import tw.zhuran.vo.VolumeVO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book/index")
public class VolumeRestController {
    private static Logger logger = LoggerFactory.getLogger(VolumeRestController.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @RequestMapping("/{bookId}")
    public BookVO book(@PathVariable("bookId") String bookId) {
        logger.info("开始生产书籍编号{}的目录", bookId);
        Book book = bookRepository.findById(bookId);
        if (book == null) {
            logger.info("书籍编号不存在");
        }
        BookVO bookVO = new BookVO();
        bookVO.setBook(book);

        List<Volume> volumes = volumeRepository.findByBookId(bookId);
        Collections.sort(volumes, Comparator.comparing(Volume::getSeq));

        List<Chapter> chapters = chapterRepository.findByBookId(bookId);

        Map<String, List<Chapter>> volumeChapters = chapters.stream()
                .collect(Collectors.groupingBy(Chapter::getVolumeId));

        List<VolumeVO> bookVolumes = bookVO.getVolumes();
        for (Volume volume : volumes) {
            VolumeVO volumeVO = new VolumeVO();
            volumeVO.setVolume(volume);
            List<Chapter> cs = volumeChapters.getOrDefault(volume.getId(), Collections.EMPTY_LIST);
            Collections.sort(cs, Comparator.comparing(Chapter::getSeq));
            volumeVO.setChapters(cs);
            bookVolumes.add(volumeVO);
        }
        return bookVO;
    }

}
