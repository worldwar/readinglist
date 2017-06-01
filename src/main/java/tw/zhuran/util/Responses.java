package tw.zhuran.util;

import tw.zhuran.domain.Response;

public class Responses {
    public static final String STATUS_OK = "1";
    public static final String STATUS_FAIL = "2";

    public static <T> Response<T> ok(T value) {
        Response<T> response = new Response<>();
        response.setStatus(STATUS_OK);
        response.setValue(value);
        return response;
    }

    public static <T> Response<T> fail(String desc) {
        Response<T> response = new Response<>();
        response.setStatus(STATUS_FAIL);
        response.setDesc(desc);
        return response;
    }
}
