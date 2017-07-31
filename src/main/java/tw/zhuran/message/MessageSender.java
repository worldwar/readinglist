package tw.zhuran.message;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.zhuran.domain.AddBookRequest;

@Service
public class MessageSender {
    private static Logger logger = LoggerFactory.getLogger(MessageSender.class);
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(AddBookRequest request) {
        String json = JSONObject.toJSONString(request);
        logger.info("start sending request");
        rabbitTemplate.convertAndSend(resolveRoutingKey(request), json);
    }

    String resolveRoutingKey(AddBookRequest request) {
        if (request.getUrl().contains("gdwxcn")) {
            return "add-book-gdwxcn";
        } else {
            return "add-book";
        }
    }
}
