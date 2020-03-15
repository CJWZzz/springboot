package com.example.springboot.web;

import com.example.springboot.mapper.CategoryMapper;
import com.example.springboot.pojo.Category1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    //自动装配
//    @Autowired CategoryDAO categoryDAO;
    @Autowired(required = false)
    CategoryMapper categoryMapper;

    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
//        List<Category> cs = categoryDAO.findAll();
        List<Category1> cs = categoryMapper.findAll();

        m.addAttribute("cs", cs);

        return "listCategory";
    }
}
