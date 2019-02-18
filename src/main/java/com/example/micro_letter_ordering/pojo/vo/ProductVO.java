/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProductVO
 * Author:   zhong
 * Date:     2019-02-18 18:10
 * Description: 商品包含leimu
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo.vo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br> 
 * 〈商品包含leimu〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by zhong on 2019-02-18.
 */
@Data
public class ProductVO {


    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
