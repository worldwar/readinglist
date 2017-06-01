package tw.zhuran.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.zhuran.domain.AddBookRequest;

@Service
public class MessageSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(AddBookRequest request) {
        rabbitTemplate.convertAndSend(request);
    }
}
