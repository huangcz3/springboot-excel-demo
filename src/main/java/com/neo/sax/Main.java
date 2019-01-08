package com.neo.sax;

/**
 * @author User
 * @date 2018-09-17 23:24
 * @desc
 */
public class Main {

    public static void main(String[] args) throws Exception {
        IRowReader reader = new IRowReaderImpl();
        ExcelReaderUtil.readExcel(reader, "F://te03.xls");
        //ExcelReaderUtil.readExcel(reader, "E:\\boleme\\DataDept\\D10.自动化报表\\02.需求管理\\报表下载模板样式\\业绩统计表模板.xlsx");
        //ExcelReaderUtil.readExcel(reader, "E:\\boleme\\DataDept\\D10.自动化报表\\02.需求管理\\报表下载模板样式\\新建 Microsoft Excel 工作表.xlsx");

    }

}
