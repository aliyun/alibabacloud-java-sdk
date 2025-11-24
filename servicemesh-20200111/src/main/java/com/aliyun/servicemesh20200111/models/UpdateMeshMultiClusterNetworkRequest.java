// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshMultiClusterNetworkRequest extends TeaModel {
    /**
     * <p>The network configuration descriptions of multiple Kubernetes clusters. The key in the map is the ID of a Kubernetes cluster, and the value is the network configuration of the cluster.</p>
     */
    @NameInMap("MultiClusterNetworks")
    public java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks;

    /**
     * <p>The ID of the ASM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateMeshMultiClusterNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshMultiClusterNetworkRequest self = new UpdateMeshMultiClusterNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshMultiClusterNetworkRequest setMultiClusterNetworks(java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks) {
        this.multiClusterNetworks = multiClusterNetworks;
        return this;
    }
    public java.util.Map<String, MultiClusterNetworksValue> getMultiClusterNetworks() {
        return this.multiClusterNetworks;
    }

    public UpdateMeshMultiClusterNetworkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
