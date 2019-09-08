package com.csy.pig.upms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class SysDept {
    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;
    @NotBlank(message = "部门名称不能为空")
    private String name;
    private Integer sort;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer parentId;

    @TableLogic
    private String delFlag;
}
