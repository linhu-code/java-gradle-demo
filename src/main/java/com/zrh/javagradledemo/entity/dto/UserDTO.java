package com.zrh.javagradledemo.entity.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserDTO {
    private List<UserDTO> list;
}

