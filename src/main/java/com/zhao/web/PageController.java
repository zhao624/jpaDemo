package com.zhao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: zhaoxugui
 * @Description:com.zhao.web
 * @Date: Created in 2017/12/11 14:22
 * @Version: 1.0.0
 */
@Controller
public class PageController {
	@RequestMapping("/index")
	public String toIndex() {
		return "index";
	}

}
