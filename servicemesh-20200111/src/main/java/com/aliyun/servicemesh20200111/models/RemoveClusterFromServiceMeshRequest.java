// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>移除集群时，保留istio-system 命名空间</p>
     */
    @NameInMap("ReserveNamespace")
    public Boolean reserveNamespace;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static RemoveClusterFromServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterFromServiceMeshRequest self = new RemoveClusterFromServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClusterFromServiceMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RemoveClusterFromServiceMeshRequest setReserveNamespace(Boolean reserveNamespace) {
        this.reserveNamespace = reserveNamespace;
        return this;
    }
    public Boolean getReserveNamespace() {
        return this.reserveNamespace;
    }

    public RemoveClusterFromServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
