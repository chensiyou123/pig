package com.csy.pig.common.core.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LoginTypeEnum {
    PWD("PWD", "账号密码登录"),
    QQ("QQ", "QQ登录"),
    WECHAT("WX", "微信登录");
    private final String type;
    private final String description;
}
