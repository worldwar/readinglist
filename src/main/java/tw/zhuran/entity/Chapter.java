package tw.zhuran.entity;

import javax.persistence.*;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    @Column(name = "chapter_id")
    private String id;
    private String bookId;
    private String volumeId;
    private Integer seq;
    private String title;
    private String originalUrl;
    private String paragraphId;

    public Long getKey() {
        return key;
    }

    public Chapter setKey(Long key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return id;
    }

    public Chapter setId(String id) {
        this.id = id;
        return this;
    }

    public String getBookId() {
        return bookId;
    }

    public Chapter setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public Chapter setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public Integer getSeq() {
        return seq;
    }

    public Chapter setSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Chapter setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public Chapter setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    public String getParagraphId() {
        return paragraphId;
    }

    public Chapter setParagraphId(String paragraphId) {
        this.paragraphId = paragraphId;
        return this;
    }
}
