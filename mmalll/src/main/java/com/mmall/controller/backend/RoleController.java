package com.mmall.controller.backend;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Role;
import com.mmall.pojo.User;
import com.mmall.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/role/")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @RequestMapping(value = "create",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Role> createRole(Role role){
        return iRoleService.createRole(role);
    }

}
