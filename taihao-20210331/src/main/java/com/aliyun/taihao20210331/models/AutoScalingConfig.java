// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AutoScalingConfig extends TeaModel {
    // autoScalingMetricNames
    @NameInMap("autoScalingMetricNames")
    public java.util.List<String> autoScalingMetricNames;

    // loadMeasureMetricName
    @NameInMap("loadMeasureMetricName")
    public String loadMeasureMetricName;

    // maxAdjustmentValue
    @NameInMap("maxAdjustmentValue")
    public Integer maxAdjustmentValue;

    // supportDecommissionWithGraceful
    @NameInMap("supportDecommissionWithGraceful")
    public Boolean supportDecommissionWithGraceful;

    public static AutoScalingConfig build(java.util.Map<String, ?> map) throws Exception {
        AutoScalingConfig self = new AutoScalingConfig();
        return TeaModel.build(map, self);
    }

    public AutoScalingConfig setAutoScalingMetricNames(java.util.List<String> autoScalingMetricNames) {
        this.autoScalingMetricNames = autoScalingMetricNames;
        return this;
    }
    public java.util.List<String> getAutoScalingMetricNames() {
        return this.autoScalingMetricNames;
    }

    public AutoScalingConfig setLoadMeasureMetricName(String loadMeasureMetricName) {
        this.loadMeasureMetricName = loadMeasureMetricName;
        return this;
    }
    public String getLoadMeasureMetricName() {
        return this.loadMeasureMetricName;
    }

    public AutoScalingConfig setMaxAdjustmentValue(Integer maxAdjustmentValue) {
        this.maxAdjustmentValue = maxAdjustmentValue;
        return this;
    }
    public Integer getMaxAdjustmentValue() {
        return this.maxAdjustmentValue;
    }

    public AutoScalingConfig setSupportDecommissionWithGraceful(Boolean supportDecommissionWithGraceful) {
        this.supportDecommissionWithGraceful = supportDecommissionWithGraceful;
        return this;
    }
    public Boolean getSupportDecommissionWithGraceful() {
        return this.supportDecommissionWithGraceful;
    }

}
