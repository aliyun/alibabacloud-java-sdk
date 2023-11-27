// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaMetric extends TeaModel {
    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    public static QuotaMetric build(java.util.Map<String, ?> map) throws Exception {
        QuotaMetric self = new QuotaMetric();
        return TeaModel.build(map, self);
    }

    public QuotaMetric setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public QuotaMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

}
