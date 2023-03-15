// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMetricMeasureData extends TeaModel {
    @NameInMap("measure")
    public String measure;

    @NameInMap("measurePointData")
    public java.util.List<MonitorMetricMeasurePointData> measurePointData;

    public static MonitorMetricMeasureData build(java.util.Map<String, ?> map) throws Exception {
        MonitorMetricMeasureData self = new MonitorMetricMeasureData();
        return TeaModel.build(map, self);
    }

    public MonitorMetricMeasureData setMeasure(String measure) {
        this.measure = measure;
        return this;
    }
    public String getMeasure() {
        return this.measure;
    }

    public MonitorMetricMeasureData setMeasurePointData(java.util.List<MonitorMetricMeasurePointData> measurePointData) {
        this.measurePointData = measurePointData;
        return this;
    }
    public java.util.List<MonitorMetricMeasurePointData> getMeasurePointData() {
        return this.measurePointData;
    }

}
