package tw.zhuran.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Volume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    private String id;
    private String bookId;
    private Integer seq;
    private String title;

    public Long getKey() {
        return key;
    }

    public Volume setKey(Long key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return id;
    }

    public Volume setId(String id) {
        this.id = id;
        return this;
    }

    public String getBookId() {
        return bookId;
    }

    public Volume setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public Integer getSeq() {
        return seq;
    }

    public Volume setSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Volume setTitle(String title) {
        this.title = title;
        return this;
    }
}
