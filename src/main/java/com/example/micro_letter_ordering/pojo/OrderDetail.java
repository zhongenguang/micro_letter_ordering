/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OrderDetail
 * Author:   zhong
 * Date:     2019-02-18 16:17
 * Description: 订单详情表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈订单详情表〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhong on 2019-02-18.
 */
@Data
public class OrderDetail {

    @ApiModelProperty(value = "订单详情表id")
    private String detailId;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "商品id")
    private String productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "当前价格,单位分")
    private BigDecimal productPrice;

    @ApiModelProperty(value = "数量")
    private Integer productQuantity;

    @ApiModelProperty(value = "小图")
    private String productIcon;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

}
