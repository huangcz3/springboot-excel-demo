package com.neo.excel;

//import org.apache.poi.ss.formula.functions.T;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Huangcz
 * @date 2018-08-08 12:48
 * @desc
 */
public class ExportExcelTest {

    public static void main(String[] args) {
        ExportExcelTest exportExcelTest = new ExportExcelTest();
        exportExcelTest.export1();
    }

    public void export1(){
        //标题名称list
        List<String> headersName = new ArrayList<>();
        headersName.add("项目类别");
        headersName.add("新潮项目数");
        headersName.add("新潮点位数");
        headersName.add("新潮占比");
        headersName.add("分众梯内电视屏数");
        headersName.add("分众梯外电视屏数");
        headersName.add("分众电梯电视小计");
        headersName.add("分众电梯电视占比");
        headersName.add("分众电梯数");
        headersName.add("分众梯内框数");
        headersName.add("分众梯外等候厅数");
        headersName.add("分众梯外框数");
        headersName.add("分众框架1.0 数");
        headersName.add("分众框架2.0 数");
        headersName.add("分众框架3.0 数");
        headersName.add("分众框架小计");
        headersName.add("分众占比");

        //标题名称对应的字段名
        List<String> headersId = new ArrayList<>();
        headersId.add("projectType");
        headersId.add("xcProjectNum");
        headersId.add("xcPointNum");
        headersId.add("xcProportion");
        headersId.add("fzTTVNum");
        headersId.add("fzTWTVNum");
        headersId.add("fzLCDCount");
        headersId.add("fzLCDProportion");
        headersId.add("fzEleNum");
        headersId.add("fzTFrameNum");
        headersId.add("fzTWaitingNum");
        headersId.add("fzTwFrameNum");
        headersId.add("fzFrameNum1");
        headersId.add("fzFrameNum2");
        headersId.add("fzFrameNum3");
        headersId.add("fzFrameCount");
        headersId.add("fzProportion");

        //导出的数据
        List<SummaryBean> dtoList = new ArrayList<>();
        SummaryBean summaryBean = new SummaryBean("住宅",
                21436,
                42187,
                "92%",
                14152,
                85900,
                10052,
                "60%",
                334010,
                1031514,
                23372,
                31090,
                577233,
                24900,
                460471,
                1062604,
                "85%");
        dtoList.add(summaryBean);
        dtoList.add(new SummaryBean("商务楼",
                21436,
                42187,
                "92%",
                14152,
                85900,
                10052,
                "60%",
                334010,
                1031514,
                23372,
                31090,
                577233,
                24900,
                460471,
                1062604,
                "85%"));
        dtoList.add(new SummaryBean("其他",
                21436,
                42187,
                "92%",
                14152,
                85900,
                10052,
                "60%",
                334010,
                1031514,
                23372,
                31090,
                577233,
                24900,
                460471,
                1062604,
                "85%"));
        System.out.println(dtoList);
        HSSFWorkbook workbook = new HSSFWorkbook();
        ExportExcelUtil exportExcelUtil = new ExportExcelUtil();
        workbook = exportExcelUtil.exportBeanToExcel(workbook, "汇总", headersName, headersId, dtoList);
        try {
            FileOutputStream exportXls = new FileOutputStream("E://test.xls");
            try {
                workbook.write(exportXls);
            } catch (IOException e) {
                e.printStackTrace();
            }
            exportXls.close();
            System.out.println("导出成功!");
        } catch (IOException e) {
            System.out.println("导出失败!");
            e.printStackTrace();
        }


    }

}
