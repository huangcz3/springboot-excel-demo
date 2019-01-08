package com.neo.service.impl;

import com.github.pagehelper.PageHelper;
import com.neo.mapper.primary.TestMapper;
import com.neo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Huangcz
 * @date 2018-07-27 10:42
 * @desc
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map> getAreaInfo(String cityId) {
        return testMapper.getAreaInfo(cityId + "%");
    }


    @Override
    public List<Map> findItemByPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        //查询所有
        List<Map> allMap = testMapper.findAll();

        return allMap;
    }
}
