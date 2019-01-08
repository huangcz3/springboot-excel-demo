package com.neo.sax;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.List;
import java.util.Map;

/**
 * @author User
 * @date 2018-09-17 22:42
 * @desc
 */
public class Test {
    public static void main(String[] args) throws Exception {

        ExcelReader reader1 = ExcelUtil.getReader("D:\\Tencent\\WeChat File\\WeChat Files\\shaoansxy\\Files\\test(1)\\test\\业绩统计表模板.xlsx");
        List<Map<String,Object>> yejihuizongData = reader1.readAll();

        System.out.println(yejihuizongData);



        //ExcelReader reader = ExcelUtil.getReader("E:\\boleme\\DataDept\\D10.自动化报表\\02.需求管理\\报表下载模板样式\\新建 Microsoft Excel 工作表.xlsx");
        //List<Map<String,Object>> xinjianData = reader.readAll();
        //System.out.println(xinjianData);
        //IRowReader reader = new IRowReaderImpl();
        //ExcelReaderUtil.readExcel(reader, "F://te03.xls");
        //ExcelReaderUtil.readExcel(reader, "E:\\boleme\\DataDept\\D10.自动化报表\\02.需求管理\\报表下载模板样式\\业绩统计表模板.xlsx");
        //ExcelReaderUtil.readExcel(reader, "E:\\boleme\\DataDept\\D10.自动化报表\\02.需求管理\\报表下载模板样式\\新建 Microsoft Excel 工作表.xlsx");



    }
}
