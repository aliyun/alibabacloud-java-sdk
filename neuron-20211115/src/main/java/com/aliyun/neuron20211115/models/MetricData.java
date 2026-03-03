// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MetricData extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>youngGcCount</p>
     */
    @NameInMap("measures")
    public String measures;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>appstat.vm</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1654777095632</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <strong>example:</strong>
     * <p>rootIp</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
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
