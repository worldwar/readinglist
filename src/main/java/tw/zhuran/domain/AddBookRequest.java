package tw.zhuran.domain;

import java.io.Serializable;

public class AddBookRequest implements Serializable {
    private String source;
    private String url;
    private String bookId;

    public String getSource() {
        return source;
    }

    public AddBookRequest setSource(String source) {
        this.source = source;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AddBookRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBookId() {
        return bookId;
    }

    public AddBookRequest setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }
}
