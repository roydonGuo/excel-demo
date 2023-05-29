package com.roydon.springdemo.controller;

import com.roydon.springdemo.domain.ExcelData;
import com.roydon.springdemo.domain.Part;
import com.roydon.springdemo.util.ExcelUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TestController {

    /**
     * excel导出
     *
     * @return
     */
    @GetMapping(value = "/export")
    public void export(HttpServletResponse response) {

        //第一行数据
        Part part1 = new Part("part1", 100);
        Part part2 = new Part("part2", 200);
        ExcelData excelData1 = new ExcelData(1, "第一行数据", Stream.of(part1, part2).collect(Collectors.toList()));

        //第二行数据
        Part part3 = new Part("part3", 300);
        Part part4 = new Part("part4", 400);
        ExcelData excelData2 = new ExcelData(2, "第二行数据", Stream.of(part3, part4).collect(Collectors.toList()));

        List<ExcelData> collect = Stream.of(excelData1, excelData2).collect(Collectors.toList());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = dateFormat.format(new Date());

        ExcelUtils.exportExcel(collect, "表格信息", "详细信息", ExcelData.class, "信息文件" + time + ".xls", response);

    }

}
