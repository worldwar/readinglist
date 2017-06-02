package tw.zhuran.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    final static String queueName = "add-book";

    final static String topicName = "bookreadertopic";

    @Bean
    Queue queue() {
        return new Queue(queueName, true, false, false);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange(topicName, true, false);
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }
}
