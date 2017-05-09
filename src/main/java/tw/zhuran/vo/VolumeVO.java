package tw.zhuran.vo;

import tw.zhuran.entity.Chapter;
import tw.zhuran.entity.Volume;

import java.util.LinkedList;
import java.util.List;

public class VolumeVO {
    private Volume volume;
    private List<Chapter> chapters = new LinkedList<>();

    public Volume getVolume() {
        return volume;
    }

    public VolumeVO setVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public VolumeVO setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
        return this;
    }
}
