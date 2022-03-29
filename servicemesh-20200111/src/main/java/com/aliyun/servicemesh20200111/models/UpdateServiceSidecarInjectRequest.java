// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateServiceSidecarInjectRequest extends TeaModel {
    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("Inject")
    public Boolean inject;

    @NameInMap("LimitCPU")
    public String limitCPU;

    @NameInMap("LimitMemory")
    public String limitMemory;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestCPU")
    public String requestCPU;

    @NameInMap("RequestMemory")
    public String requestMemory;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static UpdateServiceSidecarInjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSidecarInjectRequest self = new UpdateServiceSidecarInjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSidecarInjectRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public UpdateServiceSidecarInjectRequest setInject(Boolean inject) {
        this.inject = inject;
        return this;
    }
    public Boolean getInject() {
        return this.inject;
    }

    public UpdateServiceSidecarInjectRequest setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
        return this;
    }
    public String getLimitCPU() {
        return this.limitCPU;
    }

    public UpdateServiceSidecarInjectRequest setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
        return this;
    }
    public String getLimitMemory() {
        return this.limitMemory;
    }

    public UpdateServiceSidecarInjectRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateServiceSidecarInjectRequest setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public String getRequestCPU() {
        return this.requestCPU;
    }

    public UpdateServiceSidecarInjectRequest setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public String getRequestMemory() {
        return this.requestMemory;
    }

    public UpdateServiceSidecarInjectRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateServiceSidecarInjectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
