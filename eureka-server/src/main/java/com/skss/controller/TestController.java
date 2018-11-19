package com.skss.controller;

import com.skss.entity.Result;
import com.skss.entity.TestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("guanjia")
public class TestController {


    @RequestMapping("wonderfulActivityApp/wonderfulActivityList")
    @ResponseBody
    public Result getdata(){
        Result result = new Result();
        result.setMsg("请求成功");
        result.setCode(1);
        TestBean testBean = new TestBean();
        testBean.setName("fdsf");
        result.setData(testBean);
        return result;
    }
}
