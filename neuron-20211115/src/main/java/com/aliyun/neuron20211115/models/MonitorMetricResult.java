// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMetricResult extends TeaModel {
    @NameInMap("measureData")
    public java.util.List<MonitorMetricMeasureData> measureData;

    @NameInMap("requestId")
    public String requestId;

    public static MonitorMetricResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorMetricResult self = new MonitorMetricResult();
        return TeaModel.build(map, self);
    }

    public MonitorMetricResult setMeasureData(java.util.List<MonitorMetricMeasureData> measureData) {
        this.measureData = measureData;
        return this;
    }
    public java.util.List<MonitorMetricMeasureData> getMeasureData() {
        return this.measureData;
    }

    public MonitorMetricResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
