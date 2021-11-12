// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    // cpu数量
    @NameInMap("Cpu")
    public Long cpu;

    // gpu卡数
    @NameInMap("Gpu")
    public Long gpu;

    // GPU卡类型
    @NameInMap("GpuType")
    public String gpuType;

    // 实例类型
    @NameInMap("InstanceType")
    public String instanceType;

    // 内存(GiB)
    @NameInMap("MemoryInGiB")
    public Long memoryInGiB;

    // 磁盘类型
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    // 磁盘大小(GiB)
    @NameInMap("SystemDiskSizeInGiB")
    public Long systemDiskSizeInGiB;

    public static EcsSpec build(java.util.Map<String, ?> map) throws Exception {
        EcsSpec self = new EcsSpec();
        return TeaModel.build(map, self);
    }

    public EcsSpec setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public EcsSpec setGpu(Long gpu) {
        this.gpu = gpu;
        return this;
    }
    public Long getGpu() {
        return this.gpu;
    }

    public EcsSpec setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public EcsSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public EcsSpec setMemoryInGiB(Long memoryInGiB) {
        this.memoryInGiB = memoryInGiB;
        return this;
    }
    public Long getMemoryInGiB() {
        return this.memoryInGiB;
    }

    public EcsSpec setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public EcsSpec setSystemDiskSizeInGiB(Long systemDiskSizeInGiB) {
        this.systemDiskSizeInGiB = systemDiskSizeInGiB;
        return this;
    }
    public Long getSystemDiskSizeInGiB() {
        return this.systemDiskSizeInGiB;
    }

}
