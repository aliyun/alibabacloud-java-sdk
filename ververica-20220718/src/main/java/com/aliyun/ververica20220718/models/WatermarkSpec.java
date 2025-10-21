// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class WatermarkSpec extends TeaModel {
    @NameInMap("column")
    public String column;

    @NameInMap("watermarkExpression")
    public String watermarkExpression;

    @NameInMap("watermarkType")
    public String watermarkType;

    public static WatermarkSpec build(java.util.Map<String, ?> map) throws Exception {
        WatermarkSpec self = new WatermarkSpec();
        return TeaModel.build(map, self);
    }

    public WatermarkSpec setColumn(String column) {
        this.column = column;
        return this;
    }
    public String getColumn() {
        return this.column;
    }

    public WatermarkSpec setWatermarkExpression(String watermarkExpression) {
        this.watermarkExpression = watermarkExpression;
        return this;
    }
    public String getWatermarkExpression() {
        return this.watermarkExpression;
    }

    public WatermarkSpec setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

}
