package com.csy.pig.upms.api.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class MenuVO implements Serializable {
    private Integer menuId;
    private String name;
    private String permission;
    private Integer parentId;
    private String icon;
    private String path;
    private String component;
    private Integer sort;
    private String type;
    private String keepAlive;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String delFlag;

    @Override
    public int hashCode() {
        return menuId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MenuVO) {
            Integer targetMenuId = ((MenuVO) obj).getMenuId();
            return menuId.equals(targetMenuId);
        }
        return super.equals(obj);
    }
}
