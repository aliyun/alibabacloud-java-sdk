// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshMultiClusterNetworkShrinkRequest extends TeaModel {
    /**
     * <p>The network configuration descriptions of multiple Kubernetes clusters. The key in the map is the ID of a Kubernetes cluster, and the value is the network configuration of the cluster.</p>
     */
    @NameInMap("MultiClusterNetworks")
    public String multiClusterNetworksShrink;

    /**
     * <p>The ID of the ASM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateMeshMultiClusterNetworkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshMultiClusterNetworkShrinkRequest self = new UpdateMeshMultiClusterNetworkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshMultiClusterNetworkShrinkRequest setMultiClusterNetworksShrink(String multiClusterNetworksShrink) {
        this.multiClusterNetworksShrink = multiClusterNetworksShrink;
        return this;
    }
    public String getMultiClusterNetworksShrink() {
        return this.multiClusterNetworksShrink;
    }

    public UpdateMeshMultiClusterNetworkShrinkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
