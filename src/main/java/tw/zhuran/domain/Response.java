package tw.zhuran.domain;

public class Response<T> {
    private String status;
    private String desc;
    private T value;

    public String getStatus() {
        return status;
    }

    public Response setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Response setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public T getValue() {
        return value;
    }

    public Response setValue(T value) {
        this.value = value;
        return this;
    }
}
