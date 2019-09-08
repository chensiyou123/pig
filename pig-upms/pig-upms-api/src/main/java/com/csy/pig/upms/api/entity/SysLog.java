package com.csy.pig.upms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SysLog implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @NotBlank(message = "日志类型不能为空")
    private String type;
    @NotBlank(message = "日志标题不能为空")
    private String title;
    private String createBy;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remoteAddr;
    private String userAgent;
    private String requestUri;
    private String method;
    private String params;
    private Long time;
    private String exception;
    private String serviceId;
    @TableLogic
    private String delFlag;
}
