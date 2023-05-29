package com.roydon.springdemo.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ExcelData
 *
 * @AUTHOR: roydon
 * @DATE: 2023/5/29
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelData {

    @Excel(name = "表格id", needMerge = true, width = 20, height = 8)
    private Integer id;

    @Excel(name = "表格名称", needMerge = true, width = 20, height = 8)
    private String name;

    @ExcelCollection(name = "部分信息")
    private List<Part> partList;
}
