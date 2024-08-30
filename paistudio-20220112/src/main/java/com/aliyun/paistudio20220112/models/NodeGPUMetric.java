// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeGPUMetric extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("GPUCount")
    public Integer GPUCount;

    @NameInMap("GPUMetrics")
    public java.util.List<GPUMetric> GPUMetrics;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("MemoryUtil")
    public Float memoryUtil;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("TotalMemory")
    public Float totalMemory;

    @NameInMap("UsedMemory")
    public Float usedMemory;

    public static NodeGPUMetric build(java.util.Map<String, ?> map) throws Exception {
        NodeGPUMetric self = new NodeGPUMetric();
        return TeaModel.build(map, self);
    }

    public NodeGPUMetric setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public NodeGPUMetric setGPUCount(Integer GPUCount) {
        this.GPUCount = GPUCount;
        return this;
    }
    public Integer getGPUCount() {
        return this.GPUCount;
    }

    public NodeGPUMetric setGPUMetrics(java.util.List<GPUMetric> GPUMetrics) {
        this.GPUMetrics = GPUMetrics;
        return this;
    }
    public java.util.List<GPUMetric> getGPUMetrics() {
        return this.GPUMetrics;
    }

    public NodeGPUMetric setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public NodeGPUMetric setMemoryUtil(Float memoryUtil) {
        this.memoryUtil = memoryUtil;
        return this;
    }
    public Float getMemoryUtil() {
        return this.memoryUtil;
    }

    public NodeGPUMetric setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public NodeGPUMetric setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public NodeGPUMetric setTotalMemory(Float totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Float getTotalMemory() {
        return this.totalMemory;
    }

    public NodeGPUMetric setUsedMemory(Float usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }
    public Float getUsedMemory() {
        return this.usedMemory;
    }

}
