/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OrderMaster
 * Author:   zhong
 * Date:     2019-02-18 16:26
 * Description: 订单主表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈订单主表〉
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
public class OrderMaster {

    @ApiModelProperty(value = "订单主表id")
    private String orderId;

    @ApiModelProperty(value = "买家名字")
    private String buyerName;

    @ApiModelProperty(value = "买家电话")
    private String buyerPhone;

    @ApiModelProperty(value = "买家地址")
    private String buyerAddress;

    @ApiModelProperty(value = "买家微信openid")
    private String buyerOpenid;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal orderAmount;

    @ApiModelProperty(value = "订单状态, 默认为新下单")
    private Byte orderStatus;

    @ApiModelProperty(value = "支付状态, 默认未支付")
    private Byte payStatus;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

}
