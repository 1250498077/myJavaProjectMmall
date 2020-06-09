package com.mmall.controller.backend;


import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Menu;
import com.mmall.pojo.User;
import com.mmall.service.IMenuService;
import com.mmall.pojo.MenuAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manage/menu")
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("list")
    @ResponseBody
    public ServerResponse<List<Menu>> queryAllMenu(){
        return iMenuService.queryAllMenu();
    }


    @RequestMapping("auth/list")
    @ResponseBody
    public ServerResponse<List<MenuAuth>> queryMenuByUserId(HttpSession session){
        User currentUser = (User)session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iMenuService.queryMenuByUserId(currentUser);
    }


}
