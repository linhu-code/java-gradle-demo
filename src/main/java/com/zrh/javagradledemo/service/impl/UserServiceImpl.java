package com.zrh.javagradledemo.service.impl;


import com.zrh.javagradledemo.entity.dto.UserDTO;
import com.zrh.javagradledemo.entity.vo.UserVO;
import com.zrh.javagradledemo.mapper.UserMapper;
import com.zrh.javagradledemo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final UserMapper userMapper;

    public List<UserDTO> getUser() {
        return userMapper.getUser();
    }

    public boolean addUser(UserVO userVO) {
        return userMapper.addUser(userVO);
    }
}

