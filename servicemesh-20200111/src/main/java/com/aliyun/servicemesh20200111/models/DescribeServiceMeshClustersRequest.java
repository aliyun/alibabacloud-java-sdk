// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshClustersRequest self = new DescribeServiceMeshClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshClustersRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
