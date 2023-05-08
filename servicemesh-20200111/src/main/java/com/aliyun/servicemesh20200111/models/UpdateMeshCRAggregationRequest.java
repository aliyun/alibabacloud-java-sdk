// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshCRAggregationRequest extends TeaModel {
    /**
     * <p>The maximum number of CPU cores that are available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.</p>
     */
    @NameInMap("CPULimit")
    public String CPULimit;

    /**
     * <p>The number of CPU cores that are requested by the components installed in the Container Service for Kubernetes (ACK) cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes.</p>
     */
    @NameInMap("CPURequirement")
    public String CPURequirement;

    /**
     * <p>Specifies whether to enable the Kubernetes API on the data plane to access Istio resources in the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the Kubernetes API to access Istio resources in the ASM instance.</p>
     * <p>*   `false`: does not enable the Kubernetes API to access Istio resources in the ASM instance.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The maximum size of the memory that is available for the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     */
    @NameInMap("MemoryLimit")
    public String memoryLimit;

    /**
     * <p>The size of the memory that is requested by the components installed in the ACK cluster on the data plane if you enable the Kubernetes API to access Istio resources in the ASM instance. You can specify the parameter value in the standard quantity representation used by Kubernetes. 1 Mi equals 1,024 KB.</p>
     */
    @NameInMap("MemoryRequirement")
    public String memoryRequirement;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>Specifies whether the Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `true`: The Kubernetes API on the data plane uses the public endpoint of the API server to access Istio resources in the ASM instance.</p>
     * <p>*   `false`: The Kubernetes API on the data plane uses the private endpoint of the API server to access Istio resources in the ASM instance.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("UsePublicApiServer")
    public Boolean usePublicApiServer;

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

    public UpdateMeshCRAggregationRequest setUsePublicApiServer(Boolean usePublicApiServer) {
        this.usePublicApiServer = usePublicApiServer;
        return this;
    }
    public Boolean getUsePublicApiServer() {
        return this.usePublicApiServer;
    }

}
