// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSClusterMeshRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DisableK8sSvcDiscovery")
    public Boolean disableK8sSvcDiscovery;

    @NameInMap("DisableRegistry")
    public Boolean disableRegistry;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSClusterMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSClusterMeshRequest self = new DeleteAKSClusterMeshRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSClusterMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteAKSClusterMeshRequest setDisableK8sSvcDiscovery(Boolean disableK8sSvcDiscovery) {
        this.disableK8sSvcDiscovery = disableK8sSvcDiscovery;
        return this;
    }
    public Boolean getDisableK8sSvcDiscovery() {
        return this.disableK8sSvcDiscovery;
    }

    public DeleteAKSClusterMeshRequest setDisableRegistry(Boolean disableRegistry) {
        this.disableRegistry = disableRegistry;
        return this;
    }
    public Boolean getDisableRegistry() {
        return this.disableRegistry;
    }

    public DeleteAKSClusterMeshRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
