// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class MetricInfo extends TeaModel {
    @NameInMap("Average")
    public Float average;

    @NameInMap("Count")
    public Float count;

    @NameInMap("Maximum")
    public Float maximum;

    @NameInMap("Minimum")
    public Float minimum;

    @NameInMap("Sum")
    public Float sum;

    @NameInMap("timestamp")
    public Long timestamp;

    @NameInMap("value")
    public Float value;

    public static MetricInfo build(java.util.Map<String, ?> map) throws Exception {
        MetricInfo self = new MetricInfo();
        return TeaModel.build(map, self);
    }

    public MetricInfo setAverage(Float average) {
        this.average = average;
        return this;
    }
    public Float getAverage() {
        return this.average;
    }

    public MetricInfo setCount(Float count) {
        this.count = count;
        return this;
    }
    public Float getCount() {
        return this.count;
    }

    public MetricInfo setMaximum(Float maximum) {
        this.maximum = maximum;
        return this;
    }
    public Float getMaximum() {
        return this.maximum;
    }

    public MetricInfo setMinimum(Float minimum) {
        this.minimum = minimum;
        return this;
    }
    public Float getMinimum() {
        return this.minimum;
    }

    public MetricInfo setSum(Float sum) {
        this.sum = sum;
        return this;
    }
    public Float getSum() {
        return this.sum;
    }

    public MetricInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public MetricInfo setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
