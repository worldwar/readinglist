package tw.zhuran.rest;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tw.zhuran.domain.AddBookRequest;
import tw.zhuran.message.MessageSender;
import tw.zhuran.util.Requests;
import tw.zhuran.util.Responses;

@RestController
public class AddBookController {

    @Autowired
    private MessageSender messageSender;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object add(String url) {
        boolean validate = validate(url);
        if (validate) {
            AddBookRequest request = resolve(url);
            messageSender.send(request);
            return Responses.ok("");
        } else {
            return Responses.fail("无法解析url");
        }
    }

    private AddBookRequest resolve(String url) {
        return Requests.qidian(url, "");
    }

    private boolean validate(String url) {
        if (!Strings.isNullOrEmpty(url) && url.contains(Requests.BOOK_SOURCE_QIDIAN)) {
            return true;
        } else {
            return true;
        }
    }
}
