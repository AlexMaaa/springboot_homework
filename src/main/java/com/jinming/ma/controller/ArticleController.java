package com.jinming.ma.controller;

import com.jinming.ma.entity.Article;
import com.jinming.ma.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author majm
 * @create 2020-02-17 20:33
 * @desc
 **/
@Controller
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @RequestMapping("/index")
    public String index(Model model, Integer pageNo, Integer size, Integer total) {
        if (pageNo == null && size == null && total == null) {
            pageNo = 0;
            size = 3;
            total = 0;
        } else if (pageNo < 0) {
            pageNo = 0;
        } else if (pageNo > total) {
            pageNo = total;
        }
        PageRequest of = PageRequest.of(pageNo, size);
        Page<Article> page = articleRepository.findAll(of);
        System.out.println("当前页数:" + (page.getNumber() + 1));
        System.out.println("当前页的记录数:" + page.getNumberOfElements());
        System.out.println("每页记录数:" + page.getSize());
        System.out.println("总记录数:" + page.getTotalElements());
        System.out.println("总页数:" + page.getTotalPages());
        System.out.println("记录:" + page.getContent());

        model.addAttribute("all", page);
        model.addAttribute("pageNo", page.getNumber());
        model.addAttribute("total", page.getTotalPages() - 1);
        return "client/index";
    }
}
