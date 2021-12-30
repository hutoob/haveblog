package com.example.haveblog.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName Result.java
 * @Description TODO
 * @createTime 2021年12月29日 12:59:00
 */
@Data
public class Result implements Serializable {
    private int code; //200是正常 非200表示异常
    private String msg;
    private Object data;//返回数据
    //成功
    public static Result succ( Object data){
        return succ(200,"操作成功",data);
    }
    //成功
    public static Result succ(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    //失败
    public static Result fail(String msg){

        return fail(400,msg,null);
    }
    //失败
    public static Result fail(String msg,Object data){

        return fail(400,msg,data);
    }
    //失败
    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
