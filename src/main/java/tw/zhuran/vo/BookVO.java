package tw.zhuran.vo;

import tw.zhuran.entity.Book;

import java.util.LinkedList;
import java.util.List;

public class BookVO {
    private Book book;
    private List<VolumeVO> volumes = new LinkedList<>();

    public Book getBook() {
        return book;
    }

    public BookVO setBook(Book book) {
        this.book = book;
        return this;
    }

    public List<VolumeVO> getVolumes() {
        return volumes;
    }

    public BookVO setVolumes(List<VolumeVO> volumes) {
        this.volumes = volumes;
        return this;
    }
}
