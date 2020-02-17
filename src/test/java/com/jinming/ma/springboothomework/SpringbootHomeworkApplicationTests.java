package com.jinming.ma.springboothomework;

import com.jinming.ma.entity.Article;
import com.jinming.ma.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootHomeworkApplicationTests {
    @Autowired
    ArticleRepository articleRepository;
    @Test
    void contextLoads() {
        List<Article> all = articleRepository.findAll();
        for (Article article : all) {
            System.out.println(article);
        }
    }

}
