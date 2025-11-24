// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshMultiClusterNetworkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccb37ff104caf419fbf48fb38e6f3****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeMeshMultiClusterNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshMultiClusterNetworkRequest self = new DescribeMeshMultiClusterNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeshMultiClusterNetworkRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
