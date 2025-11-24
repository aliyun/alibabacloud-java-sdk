// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshMultiClusterNetworkResponseBody extends TeaModel {
    @NameInMap("MultiClusterNetworks")
    public java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>71680038-8009-5073-B43E-C057E9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeshMultiClusterNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshMultiClusterNetworkResponseBody self = new DescribeMeshMultiClusterNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeshMultiClusterNetworkResponseBody setMultiClusterNetworks(java.util.Map<String, MultiClusterNetworksValue> multiClusterNetworks) {
        this.multiClusterNetworks = multiClusterNetworks;
        return this;
    }
    public java.util.Map<String, MultiClusterNetworksValue> getMultiClusterNetworks() {
        return this.multiClusterNetworks;
    }

    public DescribeMeshMultiClusterNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
