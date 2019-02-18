/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ResultVO
 * Author:   zhong
 * Date:     2019-02-18 18:25
 * Description: http请求返回的最外层对象
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo.vo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈http请求返回的最外层对象〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import lombok.Data;

/**
 * Created by zhong on 2019-02-18.
 */
@Data
public class ResultVO<T> {


    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

}
