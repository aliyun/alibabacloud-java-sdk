// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeMetric extends TeaModel {
    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    @NameInMap("NodeID")
    public String nodeID;

    public static NodeMetric build(java.util.Map<String, ?> map) throws Exception {
        NodeMetric self = new NodeMetric();
        return TeaModel.build(map, self);
    }

    public NodeMetric setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public NodeMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public NodeMetric setNodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }
    public String getNodeID() {
        return this.nodeID;
    }

}
