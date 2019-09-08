package com.csy.pig.upms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysDict  extends Model<SysDict> {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @NotBlank(message = "字典项数据值不能为空")
    private String value;
    @NotBlank(message = "字典项标签不能为空")
    private String label;
    @NotBlank(message = "字典项数据类型不能为空")
    private String type;
    private String description;
    private Integer sort;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remarks;
    @TableLogic
    private String delFlag;
}
