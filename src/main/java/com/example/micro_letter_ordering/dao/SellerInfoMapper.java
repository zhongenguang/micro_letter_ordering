/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SellerInfoMapper
 * Author:   zhong
 * Date:     2019-02-18 16:46
 * Description: 商家信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.micro_letter_ordering.dao;/**
 * 〈友情提示：本类涂有防腐药品，切勿触碰，切勿触碰，切勿触碰！〉<br> 
 * 〈商家信息〉
 *
 * @author zhong
 * @create 2019-02-18
 * @since 1.0.0
 */

import com.example.micro_letter_ordering.pojo.SellerInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhong on 2019-02-18.
 */
@MapperScan
@Repository
public interface SellerInfoMapper {



    int deleteByPrimaryKey(String id);


    int insertSelective(SellerInfo record);



    int updateByPrimaryKeySelective(SellerInfo record);



}
