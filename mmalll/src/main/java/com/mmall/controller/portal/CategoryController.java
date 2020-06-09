package com.mmall.controller.portal;


import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category/")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse list() {
        return iCategoryService.findAllCategory();
    }

}
