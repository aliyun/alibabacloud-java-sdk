// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    // 规格类型
    @NameInMap("InstanceType")
    public String instanceType;

    // cpu数量
    @NameInMap("Cpu")
    public Integer cpu;

    // gpu数量
    @NameInMap("Gpu")
    public Integer gpu;

    // gpu类型
    @NameInMap("GpuType")
    public String gpuType;

    // Memory数量
    @NameInMap("Memory")
    public Integer memory;

    public static EcsSpec build(java.util.Map<String, ?> map) throws Exception {
        EcsSpec self = new EcsSpec();
        return TeaModel.build(map, self);
    }

    public EcsSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public EcsSpec setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public EcsSpec setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public EcsSpec setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public EcsSpec setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

}
