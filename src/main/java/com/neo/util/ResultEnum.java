package com.neo.util;

/**
 * @author Huangcz
 * @date 2018-05-07 14:56
 * @desc 返回结果枚举
 */
public enum ResultEnum {
    SUCCESS(0, "成功"),
    NOT_LOGIN(1, "未登录或登录超时"),
    PERMISSION_DENIED(2, "无相关权限"),
    MAX_UPLOAD_SIZE_EXCEEDED(3, "上传文件大小超过限制"),
    FILE_IS_BLANK(4, "空白文件"),
    NO_VALID_DATA(5, "无有效数据"),
    UNKNOWN_ERROR(-1, "未知错误");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
