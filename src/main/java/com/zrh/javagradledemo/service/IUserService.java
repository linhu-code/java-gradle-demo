package com.zrh.javagradledemo.service;

import com.zrh.javagradledemo.entity.dto.UserDTO;
import com.zrh.javagradledemo.entity.vo.UserVO;

import java.util.List;

public interface IUserService {
    List<UserDTO> getUser();

    boolean addUser(UserVO userVO);
}
