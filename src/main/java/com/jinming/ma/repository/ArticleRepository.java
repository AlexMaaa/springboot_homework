package com.jinming.ma.repository;

import com.jinming.ma.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author majm
 * @create 2020-02-17 20:09
 * @desc
 **/
public interface ArticleRepository extends JpaRepository<Article,Integer>, JpaSpecificationExecutor<Article> {
}
