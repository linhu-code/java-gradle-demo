package com.zrh.javagradledemo.mapper;


import com.zrh.javagradledemo.entity.dto.UserDTO;
import com.zrh.javagradledemo.entity.vo.UserVO;

import java.util.List;


public interface UserMapper {
    List<UserDTO> getUser();

    boolean addUser(UserVO userVO);
}
