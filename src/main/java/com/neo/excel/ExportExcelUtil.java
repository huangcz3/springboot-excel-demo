package com.neo.excel;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author User
 * @date 2018-08-07 22:46
 * @desc
 */
public class ExportExcelUtil<T> {


    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();
        listName.add("id");
        listName.add("名字");
        listName.add("性别");
        listName.add("新潮");
        List<String> listId = new ArrayList<>();
        listId.add("id");
        listId.add("name");
        listId.add("sex");

        List<Map<String, Object>> listB = new ArrayList<>();
        for (int t = 0; t < 6; t++) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", t);
            map.put("name", "abc" + t);
            map.put("sex", "男" + t);
            listB.add(map);
        }
        System.out.println("listB  : " + listB.toString());
        HSSFWorkbook workbook = new HSSFWorkbook();
        ExportExcelUtil exportExcelUtil = new ExportExcelUtil();
        workbook = exportExcelUtil.exportMapToExcel(workbook, "测试POI导出EXCEL文档1", listName, listId, listB);
        workbook = exportExcelUtil.exportMapToExcel(workbook, "测试POI导出EXCEL文档2", listName, listId, listB);


        try {
            FileOutputStream exportXls = new FileOutputStream("E://工单信息表Map.xls");
            try {
                workbook.write(exportXls);
            } catch (IOException e) {
                e.printStackTrace();
            }
            exportXls.close();
            System.out.println("导出成功!");
        } catch (FileNotFoundException e) {
            System.out.println("导出失败!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("导出失败!");
            e.printStackTrace();
        }

    }

    public HSSFWorkbook exportMapToExcel(HSSFWorkbook workbook, String sheetName, List<String> headersName, List<String> headersId,
                                         List<Map<String, Object>> dtoList) {
        /*
               （一）表头--标题栏
         */
        Map<Integer, String> headersNameMap = new HashMap<>();
        int key = 0;
        for (int i = 0; i < headersName.size(); i++) {
            if (!headersName.get(i).equals(null)) {
                headersNameMap.put(key, headersName.get(i));
                key++;
            }
        }
        /*
                （二）字段---标题的字段
         */
        Map<Integer, String> titleFieldMap = new HashMap<>();
        int value = 0;
        for (int i = 0; i < headersId.size(); i++) {
            if (!headersId.get(i).equals(null)) {
                titleFieldMap.put(value, headersId.get(i));
                value++;
            }
        }
       /*
                （三）声明一个工作薄：包括构建工作簿、表格、样式
       */
        HSSFSheet sheet = workbook.createSheet(sheetName);
        sheet.setDefaultColumnWidth((short) 15);
        // 生成一个样式
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFRow row = sheet.createRow(0);
        style.setAlignment(HorizontalAlignment.CENTER);
        HSSFCell cell;
        //拿到表格所有标题的value的集合
        Collection c = headersNameMap.values();
        //表格标题的迭代器
        Iterator<String> headersNameIt = c.iterator();
        /*
                （四）导出数据：包括导出标题栏以及内容栏
        */
        //根据选择的字段生成表头--标题
        short size = 0;
        while (headersNameIt.hasNext()) {
            cell = row.createCell(size);
            cell.setCellValue(headersNameIt.next().toString());
            cell.setCellStyle(style);
            size++;
        }
        //表格一行的字段的集合，以便拿到迭代器
        Collection zdC = titleFieldMap.values();
        //总记录的迭代器
        Iterator<Map<String, Object>> titleFieldIt = dtoList.iterator();
        //真正的数据记录的列序号
        int zdRow = 1;
        //记录的迭代器，遍历总记录
        while (titleFieldIt.hasNext()) {
            //拿到一条记录
            Map<String, Object> mapTemp = titleFieldIt.next();
            row = sheet.createRow(zdRow);
            zdRow++;
            int zdCell = 0;
            //一条记录的字段的集合的迭代器
            Iterator<String> zdIt = zdC.iterator();
            while (zdIt.hasNext()) {
                //字段的暂存
                String tempField = zdIt.next();
                if (mapTemp.get(tempField) != null) {
                    //写进excel对象
                    row.createCell((short) zdCell).setCellValue(String.valueOf(mapTemp.get(tempField)));
                    zdCell++;
                }
            }
        }
        return workbook;
    }

    /**
     * 这是一个通用的方法，利用了JAVA的反射机制，可以将放置在JAVA集合中并且符号一定条件的数据以EXCEL 的形式输出
     * <p>
     * title         表格标题名
     * headersName  表格属性列名数组
     * headersId    表格属性列名对应的字段---你需要导出的字段名（为了更灵活控制你想要导出的字段）
     * dtoList     需要显示的数据集合,集合中一定要放置符合javabean风格的类的对象
     * out         与输出设备关联的流对象，可以将EXCEL文档导出到本地文件或者网络中
     */
    public HSSFWorkbook exportBeanToExcel(HSSFWorkbook wb, String sheetName, List<String> headersName, List<String> headersId, List<T> dtoList) {
        /*（一）表头--标题栏*/
        Map<Integer, String> headersNameMap = new HashMap<>();
        int key = 0;
        for (int i = 0; i < headersName.size(); i++) {
            if (!headersName.get(i).equals(null)) {
                headersNameMap.put(key, headersName.get(i));
                key++;
            }
        }
        /*（二）字段*/
        Map<Integer, String> titleFieldMap = new HashMap<>();
        int value = 0;
        for (int i = 0; i < headersId.size(); i++) {
            if (!headersId.get(i).equals(null)) {
                titleFieldMap.put(value, headersId.get(i));
                value++;
            }
        }
        /* （三）声明一个工作薄：包括构建工作簿、表格、样式*/
        //HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName);
        sheet.setDefaultColumnWidth((short) 15);
        // 生成一个样式
        HSSFCellStyle style = wb.createCellStyle();
        HSSFRow row = sheet.createRow(0);
        style.setAlignment(HorizontalAlignment.CENTER);
        HSSFCell cell;
        //拿到表格所有标题的value的集合
        Collection c = headersNameMap.values();
        //表格标题的迭代器
        Iterator<String> it = c.iterator();
        /*（四）导出数据：包括导出标题栏以及内容栏*/
        //根据选择的字段生成表头
        short size = 0;
        while (it.hasNext()) {
            cell = row.createCell(size);
            cell.setCellValue(it.next().toString());
            cell.setCellStyle(format(wb));
            size++;
        }
        //表格标题一行的字段的集合
        Collection zdC = titleFieldMap.values();
        //总记录的迭代器
        Iterator<T> labIt = dtoList.iterator();
        //列序号
        int zdRow = 0;
        //记录的迭代器，遍历总记录
        while (labIt.hasNext()) {
            int zdCell = 0;
            zdRow++;
            row = sheet.createRow(zdRow);
            T l = (T) labIt.next();
            // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
            //获得JavaBean全部属性
            Field[] fields = l.getClass().getDeclaredFields();
            //遍历属性，比对
            for (short i = 0; i < fields.length; i++) {
                Field field = fields[i];
                //属性名
                String fieldName = field.getName();
                //一条字段的集合的迭代器
                Iterator<String> zdIt = zdC.iterator();
                //遍历要导出的字段集合
                while (zdIt.hasNext()) {
                    //比对JavaBean的属性名，一致就写入，不一致就丢弃
                    if (zdIt.next().equals(fieldName)) {
                        //拿到属性的get方法
                        String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                        //拿到JavaBean对象
                        Class tCls = l.getClass();
                        try {
                            //通过JavaBean对象拿到该属性的get方法，从而进行操控
                            Method getMethod = tCls.getMethod(getMethodName, new Class[]{});
                            //操控该对象属性的get方法，从而拿到属性值
                            Object val = getMethod.invoke(l, new Object[]{});
                            String textVal = null;
                            if (val != null) {
                                //转化成String
                                textVal = String.valueOf(val);
                            } else {
                                textVal = null;
                            }

                            //HSSFCellStyle cellStyle = format(wb);
                            //写进excel对象
                            HSSFCell dataCell = row.createCell((short) zdCell);
                            dataCell.setCellValue(textVal);
                            dataCell.setCellStyle(format(wb));
                            zdCell++;
                        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        //format(wb);
        return wb;
    }


    public HSSFCellStyle format(HSSFWorkbook wb){
        HSSFCellStyle cellStyle = wb.createCellStyle();

        cellStyle.setBorderBottom(BorderStyle.THIN); //下边框
        cellStyle.setBorderLeft(BorderStyle.THIN);//左边框
        cellStyle.setBorderTop(BorderStyle.THIN);//上边框
        cellStyle.setBorderRight(BorderStyle.THIN);//右边框

        //居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);//水平居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中

        //设置字体
        //HSSFFont font = wb.createFont();
        //font.setFontName("华文行楷");//设置字体名称
        //font.setFontHeightInPoints((short)28);//设置字号
        //font.setItalic(false);//设置是否为斜体
        //font.setBold(true);//设置是否加粗
        //font.setColor(IndexedColors.RED.index);//设置字体颜色
        //cellStyle.setFont(font);
        return cellStyle;
    }

}
