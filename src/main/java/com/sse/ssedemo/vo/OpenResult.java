package com.sse.ssedemo.vo;

import java.io.Serializable;

/**
 * 云路信息科技有限公司 版权所有 © Copyright 2021
 *
 * @author stuart.yu
 * @since 2023/7/20 14:23
 */
public class OpenResult implements Serializable {
    private boolean succ;
    private boolean fail;
    private Integer code;
    private String msg;
    private String version;
    private String data;

    public OpenResult() {
    }

    public OpenResult(boolean succ, boolean fail, Integer code, String msg, String version, String data) {
        this.succ = succ;
        this.fail = fail;
        this.code = code;
        this.msg = msg;
        this.version = version;
        this.data = data;
    }

    public static OpenResult succ(){
        return new OpenResult(true, false,1, null,null,null);
    }

    public static OpenResult succ(String msg){
        return new OpenResult(true, false,1, msg,null,null);
    }

    public static OpenResult fail(Integer code, String msg){
        return new OpenResult(false,true, code, msg,null,null);
    }


    public boolean isSucc(){
        return succ;
    }

    public void setSucc(boolean succ) {
        this.succ = succ;
    }

    public boolean isFail() {
        return fail;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OpenResult{" +
                "succ=" + succ +
                ", fail=" + fail +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", version='" + version + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
