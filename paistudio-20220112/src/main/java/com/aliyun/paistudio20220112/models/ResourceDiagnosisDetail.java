// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceDiagnosisDetail extends TeaModel {
    @NameInMap("ExceedResources")
    public java.util.List<String> exceedResources;

    @NameInMap("Limit")
    public ResourceAmount limit;

    @NameInMap("Status")
    public String status;

    @NameInMap("Used")
    public ResourceAmount used;

    @NameInMap("WorkloadIds")
    public java.util.List<String> workloadIds;

    public static ResourceDiagnosisDetail build(java.util.Map<String, ?> map) throws Exception {
        ResourceDiagnosisDetail self = new ResourceDiagnosisDetail();
        return TeaModel.build(map, self);
    }

    public ResourceDiagnosisDetail setExceedResources(java.util.List<String> exceedResources) {
        this.exceedResources = exceedResources;
        return this;
    }
    public java.util.List<String> getExceedResources() {
        return this.exceedResources;
    }

    public ResourceDiagnosisDetail setLimit(ResourceAmount limit) {
        this.limit = limit;
        return this;
    }
    public ResourceAmount getLimit() {
        return this.limit;
    }

    public ResourceDiagnosisDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ResourceDiagnosisDetail setUsed(ResourceAmount used) {
        this.used = used;
        return this;
    }
    public ResourceAmount getUsed() {
        return this.used;
    }

    public ResourceDiagnosisDetail setWorkloadIds(java.util.List<String> workloadIds) {
        this.workloadIds = workloadIds;
        return this;
    }
    public java.util.List<String> getWorkloadIds() {
        return this.workloadIds;
    }

}
