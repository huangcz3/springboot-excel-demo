package com.neo.util;


import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author Huangcz
 * @date 2018-05-07 14:55
 * @desc
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("1");
        list.add(1.25);
        //BitSet
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

}
