// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequestResponseBody extends TeaModel {
    @NameInMap("requestCPU")
    public Integer requestCPU;

    @NameInMap("requestGPU")
    public Integer requestGPU;

    @NameInMap("requestGPUInfos")
    public java.util.List<GPUInfo> requestGPUInfos;

    @NameInMap("requestMemory")
    public Integer requestMemory;

    public static GetResourceGroupRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequestResponseBody self = new GetResourceGroupRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequestResponseBody setRequestCPU(Integer requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    public GetResourceGroupRequestResponseBody setRequestGPU(Integer requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    public GetResourceGroupRequestResponseBody setRequestGPUInfos(java.util.List<GPUInfo> requestGPUInfos) {
        this.requestGPUInfos = requestGPUInfos;
        return this;
    }
    public java.util.List<GPUInfo> getRequestGPUInfos() {
        return this.requestGPUInfos;
    }

    public GetResourceGroupRequestResponseBody setRequestMemory(Integer requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Integer getRequestMemory() {
        return this.requestMemory;
    }

}
