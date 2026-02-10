// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ResourceConfig extends TeaModel {
    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>Tesla-V100-16G</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>10Gi</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <p>The shared memory capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>5Gi</p>
     */
    @NameInMap("SharedMemory")
    public String sharedMemory;

    public static ResourceConfig build(java.util.Map<String, ?> map) throws Exception {
        ResourceConfig self = new ResourceConfig();
        return TeaModel.build(map, self);
    }

    public ResourceConfig setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public ResourceConfig setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public ResourceConfig setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public ResourceConfig setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public ResourceConfig setSharedMemory(String sharedMemory) {
        this.sharedMemory = sharedMemory;
        return this;
    }
    public String getSharedMemory() {
        return this.sharedMemory;
    }

}
