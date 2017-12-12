package com.zhao.service;

import com.zhao.bean.ShopCar;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author: zhaoxugui
 * @Description:com.zhao.service
 * @Date: Created in 2017/12/11 16:20
 * @Version: 1.0.0
 */
public interface IShopCar extends JpaRepository<ShopCar, Integer> {



}
