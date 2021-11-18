// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserSpecialVersionGpuResourceInfoResponseBody extends TeaModel {
    @NameInMap("GpuAvailableQuota")
    public Long gpuAvailableQuota;

    @NameInMap("GpuTotalQuota")
    public Long gpuTotalQuota;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ResourceInfo> resources;

    public static GetUserSpecialVersionGpuResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserSpecialVersionGpuResourceInfoResponseBody self = new GetUserSpecialVersionGpuResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserSpecialVersionGpuResourceInfoResponseBody setGpuAvailableQuota(Long gpuAvailableQuota) {
        this.gpuAvailableQuota = gpuAvailableQuota;
        return this;
    }
    public Long getGpuAvailableQuota() {
        return this.gpuAvailableQuota;
    }

    public GetUserSpecialVersionGpuResourceInfoResponseBody setGpuTotalQuota(Long gpuTotalQuota) {
        this.gpuTotalQuota = gpuTotalQuota;
        return this;
    }
    public Long getGpuTotalQuota() {
        return this.gpuTotalQuota;
    }

    public GetUserSpecialVersionGpuResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSpecialVersionGpuResourceInfoResponseBody setResources(java.util.List<ResourceInfo> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ResourceInfo> getResources() {
        return this.resources;
    }

}
