package tw.zhuran.vo;

import tw.zhuran.entity.Chapter;
import tw.zhuran.entity.Paragraph;

public class ChapterVO {
    private Chapter chapter;
    private Paragraph paragraph;

    public Chapter getChapter() {
        return chapter;
    }

    public ChapterVO setChapter(Chapter chapter) {
        this.chapter = chapter;
        return this;
    }

    public Paragraph getParagraph() {
        return paragraph;
    }

    public ChapterVO setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
        return this;
    }
}
