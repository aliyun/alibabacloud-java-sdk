// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupTotalResponseBody extends TeaModel {
    @NameInMap("totalCPU")
    public Integer totalCPU;

    @NameInMap("totalGPU")
    public Integer totalGPU;

    @NameInMap("totalGPUInfos")
    public java.util.List<GPUInfo> totalGPUInfos;

    @NameInMap("totalMemory")
    public Integer totalMemory;

    public static GetResourceGroupTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupTotalResponseBody self = new GetResourceGroupTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupTotalResponseBody setTotalCPU(Integer totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    public GetResourceGroupTotalResponseBody setTotalGPU(Integer totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    public GetResourceGroupTotalResponseBody setTotalGPUInfos(java.util.List<GPUInfo> totalGPUInfos) {
        this.totalGPUInfos = totalGPUInfos;
        return this;
    }
    public java.util.List<GPUInfo> getTotalGPUInfos() {
        return this.totalGPUInfos;
    }

    public GetResourceGroupTotalResponseBody setTotalMemory(Integer totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Integer getTotalMemory() {
        return this.totalMemory;
    }

}
