// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceAmount extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <strong>example:</strong>
     * <p>100Gi</p>
     */
    @NameInMap("Memory")
    public String memory;

    public static ResourceAmount build(java.util.Map<String, ?> map) throws Exception {
        ResourceAmount self = new ResourceAmount();
        return TeaModel.build(map, self);
    }

    public ResourceAmount setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public ResourceAmount setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public ResourceAmount setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ResourceAmount setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
