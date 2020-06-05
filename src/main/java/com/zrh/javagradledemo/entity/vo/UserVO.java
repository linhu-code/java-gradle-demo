package com.zrh.javagradledemo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO implements Serializable {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Date date;
}
