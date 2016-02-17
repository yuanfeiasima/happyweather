package com.happy.app.model;

import lombok.Data;

/**
 * Created by wangwentao on 2016/2/17.
 */
@Data
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;
}
