package com.crazy.springboot.entity;

import java.io.Serializable;

/**
 * TODO
 *
 * @author jaclon
 * @date 2019/6/9 0:44
 */
public class PersonBean implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
