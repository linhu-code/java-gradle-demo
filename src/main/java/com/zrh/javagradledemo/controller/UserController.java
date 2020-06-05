package com.zrh.javagradledemo.controller;

import com.zrh.javagradledemo.entity.dto.UserDTO;
import com.zrh.javagradledemo.entity.vo.UserVO;
import com.zrh.javagradledemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser() {
        return iUserService.getUser();
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody UserVO userVO) {
        UserVO uv = new UserVO();
        uv.setAge(userVO.getAge());
        uv.setGender(userVO.getGender());
        uv.setName(userVO.getName());
        return iUserService.addUser(uv);
    }
}
