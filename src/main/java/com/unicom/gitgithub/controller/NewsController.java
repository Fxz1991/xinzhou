package com.unicom.gitgithub.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname: NewsController
 * @User: 19911
 * @date: 2019/5/31 9:04
 * @discription: todo
 */
@RestController
@RequestMapping(value = "news")
/*前后端分离开发使用@RestController注解*/
public class NewsController {
    //localhost:8080/news/getAll
    @RequestMapping(value = "getAll")
    public List<News> getAll(){
        News n1 = new News(1,"aaa");
        News n2 = new News(2,"bbb");
        News n3 = new News(3,"ccc");

        List<News> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        return  list;

    }
}
