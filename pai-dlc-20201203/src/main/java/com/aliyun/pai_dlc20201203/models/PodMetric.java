// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class PodMetric extends TeaModel {
    // Pod编号
    @NameInMap("PodId")
    public String podId;

    // 监控指标样本序列
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    public static PodMetric build(java.util.Map<String, ?> map) throws Exception {
        PodMetric self = new PodMetric();
        return TeaModel.build(map, self);
    }

    public PodMetric setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public PodMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

}
