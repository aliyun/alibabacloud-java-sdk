// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateInjectedProxyConfigRequest extends TeaModel {
    @NameInMap("DeploymentNames")
    public String deploymentNames;

    @NameInMap("GuestCluster")
    public String guestCluster;

    @NameInMap("LimitCPUs")
    public String limitCPUs;

    @NameInMap("LimitMemories")
    public String limitMemories;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestCPUs")
    public String requestCPUs;

    @NameInMap("RequestMemories")
    public String requestMemories;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateInjectedProxyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInjectedProxyConfigRequest self = new UpdateInjectedProxyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInjectedProxyConfigRequest setDeploymentNames(String deploymentNames) {
        this.deploymentNames = deploymentNames;
        return this;
    }
    public String getDeploymentNames() {
        return this.deploymentNames;
    }

    public UpdateInjectedProxyConfigRequest setGuestCluster(String guestCluster) {
        this.guestCluster = guestCluster;
        return this;
    }
    public String getGuestCluster() {
        return this.guestCluster;
    }

    public UpdateInjectedProxyConfigRequest setLimitCPUs(String limitCPUs) {
        this.limitCPUs = limitCPUs;
        return this;
    }
    public String getLimitCPUs() {
        return this.limitCPUs;
    }

    public UpdateInjectedProxyConfigRequest setLimitMemories(String limitMemories) {
        this.limitMemories = limitMemories;
        return this;
    }
    public String getLimitMemories() {
        return this.limitMemories;
    }

    public UpdateInjectedProxyConfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateInjectedProxyConfigRequest setRequestCPUs(String requestCPUs) {
        this.requestCPUs = requestCPUs;
        return this;
    }
    public String getRequestCPUs() {
        return this.requestCPUs;
    }

    public UpdateInjectedProxyConfigRequest setRequestMemories(String requestMemories) {
        this.requestMemories = requestMemories;
        return this;
    }
    public String getRequestMemories() {
        return this.requestMemories;
    }

    public UpdateInjectedProxyConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
