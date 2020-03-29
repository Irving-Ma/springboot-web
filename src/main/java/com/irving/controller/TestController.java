package com.irving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irving.service.OrderCouponService;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Irving
 * @deprecated 添加注释
 */
@RestController
public class TestController {
	@Autowired
    private OrderCouponService orderCouponService;

    /**
     * 列表，测试
     */
    @RequestMapping("/index")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.html");
        return modelAndView;
    }

    @RequestMapping("/userInfo")
    public Map<String,Object> userInfo(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","Irving");
        map.put("age",26);
        map.put("sax","男");
        return map;
    }
}
