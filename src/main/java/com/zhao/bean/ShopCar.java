package com.zhao.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: zhaoxugui
 * @Description:com.zhao.bean
 * @Date: Created in 2017/12/11 15:13
 * @Version: 1.0.0
 */
@Entity
@Table(name="zhao_shopCart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShopCar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String orderNumber;
	private String title;
	private Float price;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
}
