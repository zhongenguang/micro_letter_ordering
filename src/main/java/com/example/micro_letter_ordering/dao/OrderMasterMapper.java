/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OrderMasterMapper
 * Author:   zhong
 * Date:     2019-02-18 16:29
 * Description: 订单主表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.dao;
/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br>
 * 〈订单主表〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import com.example.micro_letter_ordering.pojo.OrderMaster;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;


/**
 * Created by zhong on 2019-02-18.
 */
@MapperScan
@Repository
public interface OrderMasterMapper {


    int deleteByPrimaryKey(String orderId);


    int insertSelective(OrderMaster record);

    int updateByPrimaryKeySelective(OrderMaster record);


}
