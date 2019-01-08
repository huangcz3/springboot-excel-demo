package com.neo.mapper.primary;


import java.util.List;
import java.util.Map;

/**
 * @author Huangcz
 * @date 2018-07-27 10:41
 * @desc
 */
public interface TestMapper {

    List<Map> getAreaInfo(String cityId);

    List<Map> findAll();

    int count();
}
