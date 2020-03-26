package com.imooc.dianping.common;

public enum EmBusinessError {
    UNKNOWN_ERROR(00000,"未知错误"),
    NO_OBJECT_FOUND(10001,"请求对象不存在"),
    NO_PARAMETER_FOUND(10002,"请求参数错误"),
    NO_HANDLER_FOUND(10003,"找不到执行路径操作"),
    PARAMETER_VALIDATION_ERROR(10004,"请求参数校验失败"),

    REGISTER_DUP_FAIL(20001,"该电话号已被注册"),

    LOGIN_FAIL(30001,"手机号或密码错误"),

    ADMIN_SHOULD_LOGIN(30001,"管理员需要先登入");


    private Integer errCode;

    private String errMsg;



    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
