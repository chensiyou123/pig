package com.csy.pig.common.core.util;

import com.csy.pig.common.core.constant.CommonConstants;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class R<T>implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @Setter
    private int code;
    @Getter
    @Setter
    private String msg;
    @Getter
    @Setter
    private T data;

    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public static <T> R<T> ok() {
        return restResult(null, CommonConstants.SUCCESS, null);
    }
    public static <T> R<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, null);
    }
    public static <T> R<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, msg);
    }
    public static <T> R<T> failed() {
        return restResult(null, CommonConstants.FAIL, null);
    }
    public static <T> R<T> failed(String msg) {
        return restResult(null, CommonConstants.FAIL, msg);
    }
    public static <T> R<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, null);
    }
    public static <T> R<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, msg);
    }
}
