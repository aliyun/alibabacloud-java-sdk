// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class NodeMetric extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    /**
     * <strong>example:</strong>
     * <p>asi_xxx</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    public static NodeMetric build(java.util.Map<String, ?> map) throws Exception {
        NodeMetric self = new NodeMetric();
        return TeaModel.build(map, self);
    }

    public NodeMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public NodeMetric setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

}
