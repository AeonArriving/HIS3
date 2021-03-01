package com.lwy.demo.entity;

import io.swagger.annotations.Api;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Api("检查项目表")
public class Inspection_items {
    private int iiid;
    private String iiname;
    private String iipinyin;
    private BigDecimal iimoney;
    private int iimedical;
}
