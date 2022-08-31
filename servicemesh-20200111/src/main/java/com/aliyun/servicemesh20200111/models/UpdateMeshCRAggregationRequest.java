// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshCRAggregationRequest extends TeaModel {
    @NameInMap("CPULimit")
    public String CPULimit;

    @NameInMap("CPURequirement")
    public String CPURequirement;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("MemoryLimit")
    public String memoryLimit;

    @NameInMap("MemoryRequirement")
    public String memoryRequirement;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateMeshCRAggregationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshCRAggregationRequest self = new UpdateMeshCRAggregationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshCRAggregationRequest setCPULimit(String CPULimit) {
        this.CPULimit = CPULimit;
        return this;
    }
    public String getCPULimit() {
        return this.CPULimit;
    }

    public UpdateMeshCRAggregationRequest setCPURequirement(String CPURequirement) {
        this.CPURequirement = CPURequirement;
        return this;
    }
    public String getCPURequirement() {
        return this.CPURequirement;
    }

    public UpdateMeshCRAggregationRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateMeshCRAggregationRequest setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public UpdateMeshCRAggregationRequest setMemoryRequirement(String memoryRequirement) {
        this.memoryRequirement = memoryRequirement;
        return this;
    }
    public String getMemoryRequirement() {
        return this.memoryRequirement;
    }

    public UpdateMeshCRAggregationRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
