// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMetricMeasurePointData extends TeaModel {
    @NameInMap("measure")
    public String measure;

    @NameInMap("timeStamp")
    public String timeStamp;

    @NameInMap("value")
    public String value;

    @NameInMap("valueWithUnit")
    public String valueWithUnit;

    public static MonitorMetricMeasurePointData build(java.util.Map<String, ?> map) throws Exception {
        MonitorMetricMeasurePointData self = new MonitorMetricMeasurePointData();
        return TeaModel.build(map, self);
    }

    public MonitorMetricMeasurePointData setMeasure(String measure) {
        this.measure = measure;
        return this;
    }
    public String getMeasure() {
        return this.measure;
    }

    public MonitorMetricMeasurePointData setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public MonitorMetricMeasurePointData setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MonitorMetricMeasurePointData setValueWithUnit(String valueWithUnit) {
        this.valueWithUnit = valueWithUnit;
        return this;
    }
    public String getValueWithUnit() {
        return this.valueWithUnit;
    }

}
