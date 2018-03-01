/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ItemsController1
 * Author:   Administrator
 * Date:     2018/2/27 0:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.icast.ssm.controller;


import cn.icast.ssm.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 〈一句话功能简述〉<br> 
 * 〈实现control接口〉
 *
 * @author Administrator
 * @create 2018/2/27
 * @since 1.0.0
 */
public class ItemsController2 implements HttpRequestHandler{
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);
        httpServletRequest.setAttribute("itemsList",itemsList);
        httpServletRequest.getRequestDispatcher("/itemsList.jsp").forward(httpServletRequest,httpServletResponse);
    }


//    @Override
//    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        //商品列表
//        List<Items> itemsList = new ArrayList<Items>();
//
//        Items items_1 = new Items();
//        items_1.setName("联想笔记本");
//        items_1.setPrice(6000f);
//        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//
//        Items items_2 = new Items();
//        items_2.setName("苹果手机");
//        items_2.setPrice(5000f);
//        items_2.setDetail("iphone6苹果手机！");
//
//        itemsList.add(items_1);
//        itemsList.add(items_2);
//        //创建modelAndView准备填充数据、设置视图
//        ModelAndView modelAndView = new ModelAndView();
//
//        //填充数据
//        modelAndView.addObject("itemsList", itemsList);
//        //视图
//        modelAndView.setViewName("/itemsList.jsp");
//
//
//        return modelAndView;
//    }
}