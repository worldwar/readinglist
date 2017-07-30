package tw.zhuran.entity;

import javax.persistence.*;

@Entity
public class Paragraph {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    @Column(name = "paragraph_id")
    private String id;
    private String content;

    public Long getKey() {
        return key;
    }

    public Paragraph setKey(Long key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return id;
    }

    public Paragraph setId(String id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Paragraph setContent(String content) {
        this.content = content;
        return this;
    }
}
