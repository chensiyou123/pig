package com.csy.pig.common.core.mybatis;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataScope extends HashMap {
    private String scopeName = "deptId";// 限制范围的字段名称
    private List<Integer> deptIds;//具体的数据范围
    private Boolean isOnly = false;//是否只查询本部门
}
