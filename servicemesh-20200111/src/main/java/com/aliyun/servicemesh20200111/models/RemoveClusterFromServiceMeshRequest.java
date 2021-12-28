// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

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

    public RemoveClusterFromServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
