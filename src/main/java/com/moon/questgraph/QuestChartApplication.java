package com.moon.questgraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class QuestChartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestChartApplication.class, args);
    }

}
