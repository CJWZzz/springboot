package com.example.springboot.mapper;

import com.example.springboot.pojo.Category1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//表示这是一个Mybatis Mapper接口
@Mapper
public interface CategoryMapper {

    //使用@Select注解表示调用findAll方法会去执行对应的sql语句。
//    @Select("select * from category_ ")
    List<Category1> findAll();
}
