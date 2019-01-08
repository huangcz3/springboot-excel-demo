package com.neo.service;



import java.util.List;
import java.util.Map;

/**
 * @author Huangcz
 * @date 2018-07-27 10:41
 * @desc
 */
public interface ITestService {

    List<Map> getAreaInfo(String cityId);


    List<Map> findItemByPage(int currentPage, int pageSize);
}
