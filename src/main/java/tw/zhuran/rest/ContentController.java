package tw.zhuran.rest;

import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.zhuran.entity.Chapter;
import tw.zhuran.entity.Paragraph;
import tw.zhuran.repository.ChapterRepository;
import tw.zhuran.repository.ParagraphRespository;
import tw.zhuran.vo.ChapterVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("content")
public class ContentController {

    @Resource
    private ChapterRepository chapterRepository;

    @Resource
    private ParagraphRespository paragraphRespository;

    @RequestMapping("{chapterId}")
    public Object content(@PathVariable("chapterId") String chapterId) {
        ChapterVO result = new ChapterVO();
        Chapter chapter = chapterRepository.findById(chapterId);
        if (chapter != null && !Strings.isNullOrEmpty(chapter.getParagraphId())) {
            Paragraph paragraph = paragraphRespository.findById(chapter.getParagraphId());
            if (paragraph != null) {
                result.setChapter(chapter);
                result.setParagraph(paragraph);
            }
        }
        return result;
    }
}
