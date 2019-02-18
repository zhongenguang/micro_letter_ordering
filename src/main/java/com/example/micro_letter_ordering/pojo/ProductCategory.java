/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProductCategory
 * Author:   zhong
 * Date:     2019-02-18 16:36
 * Description: 类目标
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.pojo;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br> 
 * 〈类目表〉
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
public class ProductCategory {

    @ApiModelProperty(value = "类目表id")
    private Integer categoryId;

    @ApiModelProperty(value = "类目名字")
    private String categoryName;

    @ApiModelProperty(value = "类目编号")
    private Integer categoryType;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

}
