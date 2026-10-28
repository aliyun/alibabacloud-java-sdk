// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeGPUMetric extends TeaModel {
    /**
     * <p>The accelerator type.</p>
     * 
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The GPU count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPUCount")
    public Integer GPUCount;

    /**
     * <p>The GPU metrics.</p>
     */
    @NameInMap("GPUMetrics")
    public java.util.List<GPUMetric> GPUMetrics;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>V100</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The memory utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MemoryUtil")
    public Float memoryUtil;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lingj19q90jp66nq-mg1a2kc92f9nn8yd-20</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c8i.xlarge</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The total memory.</p>
     */
    @NameInMap("TotalMemory")
    public Float totalMemory;

    /**
     * <p>The used memory.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
