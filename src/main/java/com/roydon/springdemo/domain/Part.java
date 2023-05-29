package com.roydon.springdemo.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Part
 *
 * @AUTHOR: roydon
 * @DATE: 2023/5/29
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Part {

    @Excel(name = "名称", width = 20, height = 8)
    private String name;

    @Excel(name = "值", width = 20, height = 8)
    private Integer value;
}
