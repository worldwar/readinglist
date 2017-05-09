package tw.zhuran;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;


public class PostDateSource {

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/readinglist");
        dataSource.setUsername("postgresql");
        dataSource.setPassword("postgresql");
        return dataSource;
    }

}
