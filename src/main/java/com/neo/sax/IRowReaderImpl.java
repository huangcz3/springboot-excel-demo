package com.neo.sax;

import java.util.List;

/**
 * @author User
 * @date 2018-09-17 22:37
 * @desc
 */
public class IRowReaderImpl implements IRowReader {

    /**
     * 业务逻辑实现方法
     * @param sheetIndex
     * @param curRow
     * @param rowlist
     */
    @Override
    public void getRows(int sheetIndex, int curRow, List<String> rowlist) {

        System.out.print(curRow + " ");
        for (int i = 0; i < rowlist.size(); i++) {
            System.out.print(rowlist.get(i) + " ");
        }
        System.out.println();
    }

}
