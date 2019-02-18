/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProductInfoVO
 * Author:   zhong
 * Date:     2019-02-18 18:12
 * Description: 商品详情
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo.vo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈商品详情〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by zhong on 2019-02-18.
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
