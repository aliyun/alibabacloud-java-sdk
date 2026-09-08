// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequestResponseBody extends TeaModel {
    /**
     * <p>The total number of CPUs that have been assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("requestCPU")
    public Integer requestCPU;

    /**
     * <p>The total number of GPUs that have been assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("requestGPU")
    public Integer requestGPU;

    /**
     * <p>The assigned GPU resources counted separately by GPU type.</p>
     */
    @NameInMap("requestGPUInfos")
    public java.util.List<GPUInfo> requestGPUInfos;

    /**
     * <p>The total amount of memory that has been assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
