// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MetricData extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("measures")
    public String measures;

    @NameInMap("metric")
    public String metric;

    @NameInMap("time")
    public Long time;

    @NameInMap("type")
    public String type;

    @NameInMap("typeValue")
    public String typeValue;

    public static MetricData build(java.util.Map<String, ?> map) throws Exception {
        MetricData self = new MetricData();
        return TeaModel.build(map, self);
    }

    public MetricData setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public MetricData setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public MetricData setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public MetricData setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public MetricData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MetricData setTypeValue(String typeValue) {
        this.typeValue = typeValue;
        return this;
    }
    public String getTypeValue() {
        return this.typeValue;
    }

}
