package com.happy.app.model;

import lombok.Data;

/**
 * Created by wangwentao on 2016/2/17.
 */
@Data
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;
}
