package com.gbase.jdbctest.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一返回值
 */

@Data
@ApiModel(value = "ResponseData", description = "统一返回值")
public class ResponseData<T> {

    @ApiModelProperty(value = "结果状态,true成功,false失败", example = "true", position = 0)
    private boolean success;

    @ApiModelProperty(value = "结果集", position = 1)
    private T data;

    public ResponseData<T> setData(T data) {
        this.data = data;
        return this;
    }

    @ApiModelProperty(value = "编码", position = 2)
    private String code;

    @ApiModelProperty(value = "提示信息", position = 3)
    private String message;

    public ResponseData<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseData(){}
    public ResponseData(boolean success, T data, String code, String message){
        this.code = code;
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public static<T> ResponseData<T> success(){
        return new ResponseData<>(true, null, ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getName());
    }

    public static<T> ResponseData<T> success(ErrorCode errorCode){
        return new ResponseData<>(true, null, errorCode.getCode(), errorCode.getName());
    }

    public static<T> ResponseData<T> success(T data){
        return new ResponseData<>(true, data, ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getName());
    }

    public static<T> ResponseData<T> success(ErrorCode errorCode, T data){
        return new ResponseData<>(true, data, errorCode.getCode(), errorCode.getName());
    }

    public static<T> ResponseData<T> success(ErrorCode errorCode, T data, Object... args) {
        String s = String.format(errorCode.getName(), args);
        return new ResponseData<>(true, data, errorCode.getCode(), s);
    }

    public static<T> ResponseData<T> fail(){
        return new ResponseData<>(false, null, ErrorCode.FAILED.getCode(), ErrorCode.FAILED.getName());
    }

    // 具有返回信息 code 的 success 设置为true  前台拦截器
    public static<T> ResponseData<T> fail(ErrorCode errorCode){
        return new ResponseData<>(false, null, errorCode.getCode(), errorCode.getName());
    }

    public static<T> ResponseData<T> fail(T data){
        return new ResponseData<>(false, data, ErrorCode.FAILED.getCode(), ErrorCode.FAILED.getName());
    }

    // 具有返回信息 code 的 success 设置为true  前台拦截器
    public static<T> ResponseData<T> fail(ErrorCode errorCode, T data){
        return new ResponseData<>(false, data, errorCode.getCode(), errorCode.getName());
    }

    // 具有返回信息 code 的 success 设置为true  前台拦截器
    public static<T> ResponseData<T> fail(ErrorCode errorCode, T data, Object... args) {
        String s = String.format(errorCode.getName(), args);
        return new ResponseData<>(false, data, errorCode.getCode(), s);
    }

}