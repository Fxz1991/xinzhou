package com.unicom.gitgithub.entity;

/**
 * @Classname: News
 * @User: 19911
 * @date: 2019/5/31 9:29
 * @discription: todo
 */

public class News{
    private Integer id;
    String name;

    public News(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
