package tw.zhuran.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    @Column(name = "book_id")
    private String id;
    private String title;
    private String author;
    private String authorId;
    private String originalUrl;
    private Date createDate;
    private Date importDate;

    public Long getKey() {
        return key;
    }

    public Book setKey(Long key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return id;
    }

    public Book setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getAuthorId() {
        return authorId;
    }

    public Book setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public Book setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Book setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Date getImportDate() {
        return importDate;
    }

    public Book setImportDate(Date importDate) {
        this.importDate = importDate;
        return this;
    }
}
