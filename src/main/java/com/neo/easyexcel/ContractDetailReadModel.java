package com.neo.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 梯内合同明细数据
 *
 * @author zhangjian
 * @date 2018/8/29 10:40
 * @since V1.0
 */
@Data
public class ContractDetailReadModel extends BaseRowModel {

	/**
	 * 主键id
	 */
	private Long id;
	/**
	 * 上传文件id
	 */
	private Long reportId;
	/**
	 * 业绩城市大区
	 */
	@ExcelProperty(index = 0)
	private String largeArea;
	/**
	 * 合同编号
	 */
	@ExcelProperty(index = 1)
	private String contractNumber;
	/**
	 * 签约日期
	 */
	@ExcelProperty(index = 2)
	private String signingDate;
	/**
	 * 刊播城市
	 */
	@ExcelProperty(index = 3)
	private String publishCity;
	/**
	 * 业绩计入城市
	 */
	@ExcelProperty(index = 4)
	private String achievementCity;
	/**
	 * 年度
	 */
	@ExcelProperty(index = 5)
	private String year;
	/**
	 * 月份
	 */
	@ExcelProperty(index = 6)
	private String month;
	/**
	 * 月周
	 */
	@ExcelProperty(index = 7)
	private String week;
	/**
	 * 上刊日期
	 */
	@ExcelProperty(index = 8)
	private String publicationDate;
	/**
	 * 下刊日期
	 */
	@ExcelProperty(index = 9)
	private String revokeDate;
	/**
	 * 客户全称
	 */
	@ExcelProperty(index = 10)
	private String customerName;
	/**
	 * 品牌名称
	 */
	@ExcelProperty(index = 11)
	private String brandName;
	/**
	 * 屏幕
	 */
	@ExcelProperty(index = 12)
	private String screen;
	/**
	 * 时长
	 */
	@ExcelProperty(index = 13)
	private String lengthTime;
	/**
	 * 频次
	 */
	@ExcelProperty(index = 14)
	private String frequency;
	/**
	 * 购买台数
	 */
	@ExcelProperty(index = 15)
	private String buyNums;
	/**
	 * 上刊广告位数
	 */
	@ExcelProperty(index = 16)
	private String positionNums;
	/**
	 * 合同金额
	 */
	@ExcelProperty(index = 17)
	private String contractAmount;
	/**
	 * 上刊金额
	 */
	@ExcelProperty(index = 18)
	private String publicationAmount;
	/**
	 * 签约上刊金额
	 */
	@ExcelProperty(index = 19)
	private String signAmount;
	/**
	 * 行业
	 */
	@ExcelProperty(index = 20)
	private String industry;
	/**
	 * 销售人员
	 */
	@ExcelProperty(index = 21)
	private String saleName;
	/**
	 * 经营部
	 */
	@ExcelProperty(index = 22)
	private String businessDepartment;
	/**
	 * 事业部
	 */
	@ExcelProperty(index = 23)
	private String causeDepartment;
	/**
	 * 签约城市
	 */
	@ExcelProperty(index = 24)
	private String signCity;
	/**
	 * 付款方式
	 */
	@ExcelProperty(index = 25)
	private String paymentMethod;
	/**
	 * 客户类型
	 */
	@ExcelProperty(index = 26)
	private String customerType;
	/**
	 * 二级客户类型
	 */
	@ExcelProperty(index = 27)
	private String secondCustomerType;

	/**
	 * 是否双方盖章（新增）
	 */
	@ExcelProperty(index = 28)
	private String sealedEachOther;

	/**
	 * 备注
	 */
	@ExcelProperty(index = 29)
	private String remarks;
}
