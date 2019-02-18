/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SellerInfo
 * Author:   zhong
 * Date:     2019-02-18 16:47
 * Description: 商家信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈商家信息〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by zhong on 2019-02-18.
 */
@Data
public class SellerInfo {

    @ApiModelProperty(value = "用户id")
    private String id;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "微信openid")
    private String openid;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

}
