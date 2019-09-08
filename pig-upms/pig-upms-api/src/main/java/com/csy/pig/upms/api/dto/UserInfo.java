package com.csy.pig.upms.api.dto;

import com.csy.pig.upms.api.entity.SysUser;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private SysUser sysUser;
    private String[] permissions;
    private Integer[] roles;
}
