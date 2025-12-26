// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    /**
     * <p>CPU核数</p>
     */
    @NameInMap("CPU")
    public Integer CPU;

    /**
     * <p>驱动版本</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <p>GPU卡数</p>
     */
    @NameInMap("GPU")
    public Integer GPU;

    /**
     * <p>GPU类型</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>机型名称</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>内存大小</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>副本数量</p>
     */
    @NameInMap("PodCount")
    public Integer podCount;

    /**
     * <p>共享内存容量</p>
     */
    @NameInMap("SharedMemory")
    public Integer sharedMemory;

    /**
     * <p>节点类型</p>
     */
    @NameInMap("Type")
    public String type;

    public static EcsSpec build(java.util.Map<String, ?> map) throws Exception {
        EcsSpec self = new EcsSpec();
        return TeaModel.build(map, self);
    }

    public EcsSpec setCPU(Integer CPU) {
        this.CPU = CPU;
        return this;
    }
    public Integer getCPU() {
        return this.CPU;
    }

    public EcsSpec setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public EcsSpec setGPU(Integer GPU) {
        this.GPU = GPU;
        return this;
    }
    public Integer getGPU() {
        return this.GPU;
    }

    public EcsSpec setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public EcsSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public EcsSpec setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public EcsSpec setPodCount(Integer podCount) {
        this.podCount = podCount;
        return this;
    }
    public Integer getPodCount() {
        return this.podCount;
    }

    public EcsSpec setSharedMemory(Integer sharedMemory) {
        this.sharedMemory = sharedMemory;
        return this;
    }
    public Integer getSharedMemory() {
        return this.sharedMemory;
    }

    public EcsSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
