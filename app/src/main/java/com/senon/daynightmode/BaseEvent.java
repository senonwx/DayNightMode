package com.senon.daynightmode;

/**
 * eventbus发送实体
 */
public class BaseEvent<T> {

    /**
     * 1:改变白天夜晚主题
     */
    private int code;
    private String msg;
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
