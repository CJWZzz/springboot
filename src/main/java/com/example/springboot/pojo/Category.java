package com.example.springboot.pojo;

import lombok.Data;

import javax.persistence.*;

//注解表示这是个实体类
@Entity
//表示这个类对应的表名是 category_ ，注意有下划线哦
@Table(name = "category_")
@Data
public class Category {

    //表明主键
    @Id
    //表明自增长方式
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //表明对应的数据库字段名
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
