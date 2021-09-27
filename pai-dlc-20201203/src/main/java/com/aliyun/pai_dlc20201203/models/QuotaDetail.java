// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class QuotaDetail extends TeaModel {
    // CPU核数
    @NameInMap("CPU")
    public String CPU;

    // 内存容量
    @NameInMap("Memory")
    public String memory;

    // GPU卡数
    @NameInMap("GPU")
    public String GPU;

    // GPU卡型
    @NameInMap("GPUType")
    public String GPUType;

    // GPU卡型全名
    @NameInMap("GPUTypeFullName")
    public String GPUTypeFullName;

    // GPU详情
    @NameInMap("GPUDetails")
    public java.util.List<GPUDetail> GPUDetails;

    public static QuotaDetail build(java.util.Map<String, ?> map) throws Exception {
        QuotaDetail self = new QuotaDetail();
        return TeaModel.build(map, self);
    }

    public QuotaDetail setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public QuotaDetail setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public QuotaDetail setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public QuotaDetail setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public QuotaDetail setGPUTypeFullName(String GPUTypeFullName) {
        this.GPUTypeFullName = GPUTypeFullName;
        return this;
    }
    public String getGPUTypeFullName() {
        return this.GPUTypeFullName;
    }

    public QuotaDetail setGPUDetails(java.util.List<GPUDetail> GPUDetails) {
        this.GPUDetails = GPUDetails;
        return this;
    }
    public java.util.List<GPUDetail> getGPUDetails() {
        return this.GPUDetails;
    }

}
