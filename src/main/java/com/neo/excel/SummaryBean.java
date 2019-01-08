package com.neo.excel;

import lombok.Data;

/**
 * @author Huangcz
 * @date 2018-08-08 12:37
 * @desc
 */
public class SummaryBean {

    /**
     * 项目类别
     */
    private String projectType;

    /**
     * 新潮项目数
     */
    private Integer xcProjectNum;

    /**
     * 新潮点位数
     */
    private Integer xcPointNum;
    /**
     * 新潮占比
     */
    private String xcProportion;
    /**
     * 分众梯内电视屏数
     */
    private Integer fzTTVNum;

    /**
     * 分众梯外电视屏数
     */
    private Integer fzTWTVNum;

    /**
     * 分众电梯电视小计
     */
    private Integer fzLCDCount;

    /**
     * 分众电梯电视占比
     */
    private String fzLCDProportion;

    /**
     * 分众电梯数
     */
    private Integer fzEleNum;

    /**
     * 分众梯内框数
     */
    private Integer fzTFrameNum;


    /**
     * 分众梯外等候厅数
     */
    private Integer fzTWaitingNum;

    /**
     * 分众梯外框数
     */
    private Integer fzTwFrameNum;

    /**
     * 分众框架1.0 数
     */
    private Integer fzFrameNum1;

    /**
     * 分众框架2.0 数
     */
    private Integer fzFrameNum2;

    /**
     * 分众框架3.0 数
     */
    private Integer fzFrameNum3;

    /**
     * 分众框架小计
     */
    private Integer fzFrameCount;

    /**
     * 分众占比
     */
    private String fzProportion;

    public SummaryBean(String projectType, Integer xcProjectNum, Integer xcPointNum, String xcProportion, Integer fzTTVNum, Integer fzTWTVNum, Integer fzLCDCount, String fzLCDProportion, Integer fzEleNum, Integer fzTFrameNum, Integer fzTWaitingNum, Integer fzTwFrameNum, Integer fzFrameNum1, Integer fzFrameNum2, Integer fzFrameNum3, Integer fzFrameCount, String fzProportion) {
        this.projectType = projectType;
        this.xcProjectNum = xcProjectNum;
        this.xcPointNum = xcPointNum;
        this.xcProportion = xcProportion;
        this.fzTTVNum = fzTTVNum;
        this.fzTWTVNum = fzTWTVNum;
        this.fzLCDCount = fzLCDCount;
        this.fzLCDProportion = fzLCDProportion;
        this.fzEleNum = fzEleNum;
        this.fzTFrameNum = fzTFrameNum;
        this.fzTWaitingNum = fzTWaitingNum;
        this.fzTwFrameNum = fzTwFrameNum;
        this.fzFrameNum1 = fzFrameNum1;
        this.fzFrameNum2 = fzFrameNum2;
        this.fzFrameNum3 = fzFrameNum3;
        this.fzFrameCount = fzFrameCount;
        this.fzProportion = fzProportion;
    }

    @Override
    public String toString() {
        return "SummaryBean{" +
                "projectType='" + projectType + '\'' +
                ", xcProjectNum=" + xcProjectNum +
                ", xcPointNum=" + xcPointNum +
                ", xcProportion='" + xcProportion + '\'' +
                ", fzTTVNum=" + fzTTVNum +
                ", fzTWTVNum=" + fzTWTVNum +
                ", fzLCDCount=" + fzLCDCount +
                ", fzLCDProportion='" + fzLCDProportion + '\'' +
                ", fzEleNum=" + fzEleNum +
                ", fzTFrameNum=" + fzTFrameNum +
                ", fzTWaitingNum=" + fzTWaitingNum +
                ", fzTwFrameNum=" + fzTwFrameNum +
                ", fzFrameNum1=" + fzFrameNum1 +
                ", fzFrameNum2=" + fzFrameNum2 +
                ", fzFrameNum3=" + fzFrameNum3 +
                ", fzFrameCount=" + fzFrameCount +
                ", fzProportion='" + fzProportion + '\'' +
                '}';
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public Integer getXcProjectNum() {
        return xcProjectNum;
    }

    public void setXcProjectNum(Integer xcProjectNum) {
        this.xcProjectNum = xcProjectNum;
    }

    public Integer getXcPointNum() {
        return xcPointNum;
    }

    public void setXcPointNum(Integer xcPointNum) {
        this.xcPointNum = xcPointNum;
    }

    public String getXcProportion() {
        return xcProportion;
    }

    public void setXcProportion(String xcProportion) {
        this.xcProportion = xcProportion;
    }

    public Integer getFzTTVNum() {
        return fzTTVNum;
    }

    public void setFzTTVNum(Integer fzTTVNum) {
        this.fzTTVNum = fzTTVNum;
    }

    public Integer getFzTWTVNum() {
        return fzTWTVNum;
    }

    public void setFzTWTVNum(Integer fzTWTVNum) {
        this.fzTWTVNum = fzTWTVNum;
    }

    public Integer getFzLCDCount() {
        return fzLCDCount;
    }

    public void setFzLCDCount(Integer fzLCDCount) {
        this.fzLCDCount = fzLCDCount;
    }

    public String getFzLCDProportion() {
        return fzLCDProportion;
    }

    public void setFzLCDProportion(String fzLCDProportion) {
        this.fzLCDProportion = fzLCDProportion;
    }

    public Integer getFzEleNum() {
        return fzEleNum;
    }

    public void setFzEleNum(Integer fzEleNum) {
        this.fzEleNum = fzEleNum;
    }

    public Integer getFzTFrameNum() {
        return fzTFrameNum;
    }

    public void setFzTFrameNum(Integer fzTFrameNum) {
        this.fzTFrameNum = fzTFrameNum;
    }

    public Integer getFzTWaitingNum() {
        return fzTWaitingNum;
    }

    public void setFzTWaitingNum(Integer fzTWaitingNum) {
        this.fzTWaitingNum = fzTWaitingNum;
    }

    public Integer getFzTwFrameNum() {
        return fzTwFrameNum;
    }

    public void setFzTwFrameNum(Integer fzTwFrameNum) {
        this.fzTwFrameNum = fzTwFrameNum;
    }

    public Integer getFzFrameNum1() {
        return fzFrameNum1;
    }

    public void setFzFrameNum1(Integer fzFrameNum1) {
        this.fzFrameNum1 = fzFrameNum1;
    }

    public Integer getFzFrameNum2() {
        return fzFrameNum2;
    }

    public void setFzFrameNum2(Integer fzFrameNum2) {
        this.fzFrameNum2 = fzFrameNum2;
    }

    public Integer getFzFrameNum3() {
        return fzFrameNum3;
    }

    public void setFzFrameNum3(Integer fzFrameNum3) {
        this.fzFrameNum3 = fzFrameNum3;
    }

    public Integer getFzFrameCount() {
        return fzFrameCount;
    }

    public void setFzFrameCount(Integer fzFrameCount) {
        this.fzFrameCount = fzFrameCount;
    }

    public String getFzProportion() {
        return fzProportion;
    }

    public void setFzProportion(String fzProportion) {
        this.fzProportion = fzProportion;
    }
}
