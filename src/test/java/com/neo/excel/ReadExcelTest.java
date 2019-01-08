package com.neo.excel;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.neo.easyexcel.ContractDetailReadModel;
import com.neo.easyexcel.ExcelListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;


/**
 * @author Huangcz
 * @date 2018-12-12 11:13
 * @desc xxx
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadExcelTest {

	@Test
	public void test() throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("D:\\tmp\\111.xlsx");
		try {
			// 解析每行结果在listener中处理
			ExcelListener excelListener = new ExcelListener();
			ExcelReader excelReader = EasyExcelFactory.getReader(inputStream,excelListener);
			List<Sheet> sheetList = excelReader.getSheets();
			for (Sheet sheet : sheetList) {
				if (sheet != null) {
					String sheetName = sheet.getSheetName();
					switch (sheetName) {
						case "梯内合同明细表":
							sheet.setClazz(ContractDetailReadModel.class);
							excelReader.read(sheet);
							System.out.println(sheetName);
							break;
						case "梯视合同明细表":
							System.out.println(sheetName);
							break;
						default:
							break;
					}
				}
			}
		} catch (Exception e) {
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
