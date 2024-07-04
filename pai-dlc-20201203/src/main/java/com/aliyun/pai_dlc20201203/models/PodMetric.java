// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class PodMetric extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210329110128-746bf7cl47pr8-worker-0</p>
     */
    @NameInMap("PodId")
    public String podId;

    public static PodMetric build(java.util.Map<String, ?> map) throws Exception {
        PodMetric self = new PodMetric();
        return TeaModel.build(map, self);
    }

    public PodMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public PodMetric setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

}
