package com.example.micro_letter_ordering.result;


import io.swagger.annotations.ApiModelProperty;

public class HttpResultBean {

    //返回状态码   1-成功  0-失败
    @ApiModelProperty("返回状态码")
    private Integer status ;

    //返回信息
    @ApiModelProperty("返回信息")
    private String message ;

    //返回参数
    @ApiModelProperty("返回参数")
    private Object data    ;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
