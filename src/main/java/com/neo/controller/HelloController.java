package com.neo.controller;

import com.neo.service.ITestService;
import com.neo.util.Result;
import com.neo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private ITestService testService;

    @PostMapping("/hello/{cityId}.json")
    public List<Map> index(@PathVariable String cityId) {
        return testService.getAreaInfo(cityId);
//        return "Hello Spring Boot 2.0!";
    }


    @GetMapping("/test")
    public Result test(int currentPage, int pageSize) {
        List<Map> result = testService.findItemByPage(currentPage, pageSize);
        return ResultUtil.success(result);
    }

}