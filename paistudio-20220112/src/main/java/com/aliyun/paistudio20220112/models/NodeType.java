// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeType extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("AllocatableCPU")
    public String allocatableCPU;

    @NameInMap("AllocatableMemory")
    public String allocatableMemory;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <strong>example:</strong>
     * <p>80G</p>
     */
    @NameInMap("GPUMemory")
    public String GPUMemory;

    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <strong>example:</strong>
     * <p>64Gi</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <strong>example:</strong>
     * <p>ecs.g6.4xlarge</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("SystemReservedCPU")
    public String systemReservedCPU;

    @NameInMap("SystemReservedMemory")
    public String systemReservedMemory;

    public static NodeType build(java.util.Map<String, ?> map) throws Exception {
        NodeType self = new NodeType();
        return TeaModel.build(map, self);
    }

    public NodeType setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public NodeType setAllocatableCPU(String allocatableCPU) {
        this.allocatableCPU = allocatableCPU;
        return this;
    }
    public String getAllocatableCPU() {
        return this.allocatableCPU;
    }

    public NodeType setAllocatableMemory(String allocatableMemory) {
        this.allocatableMemory = allocatableMemory;
        return this;
    }
    public String getAllocatableMemory() {
        return this.allocatableMemory;
    }

    public NodeType setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public NodeType setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public NodeType setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
        return this;
    }
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    public NodeType setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public NodeType setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public NodeType setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public NodeType setSystemReservedCPU(String systemReservedCPU) {
        this.systemReservedCPU = systemReservedCPU;
        return this;
    }
    public String getSystemReservedCPU() {
        return this.systemReservedCPU;
    }

    public NodeType setSystemReservedMemory(String systemReservedMemory) {
        this.systemReservedMemory = systemReservedMemory;
        return this;
    }
    public String getSystemReservedMemory() {
        return this.systemReservedMemory;
    }

}
