package com.example.springmybaits.CommonResult;

public enum ResponseCode {
	

    SUCCESS("0","SUCCESS"),
    ERROR("1","ERROR"),
    NEED_LOGIN("10","NEED_LOGIN"),
    ILLEGAL_ARGUMENT("2","ILLEGAL_ARGUMENT");

    private final String code;
    private final String desc;

    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

	
}
