package tw.zhuran.util;

import tw.zhuran.domain.AddBookRequest;

public class Requests {
    public static final String BOOK_SOURCE_QIDIAN = "qidian";

    public static AddBookRequest qidian(String url, String bookId) {
        AddBookRequest request = new AddBookRequest();
        request.setSource(BOOK_SOURCE_QIDIAN);
        request.setUrl(url);
        request.setBookId(bookId);
        return request;
    }

}
