// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveClusterFromServiceMeshRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to reserve the istio-system namespace when you delete the cluster. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReserveNamespace")
    public Boolean reserveNamespace;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce3c25e247da24f3aab9b7edfae83****</p>
     */
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
