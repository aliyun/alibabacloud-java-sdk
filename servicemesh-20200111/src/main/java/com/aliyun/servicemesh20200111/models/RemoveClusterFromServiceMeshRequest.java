// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static RemoveClusterFromServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterFromServiceMeshRequest self = new RemoveClusterFromServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClusterFromServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public RemoveClusterFromServiceMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
