// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNodesInstanceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeNodesInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodesInstanceTypeRequest self = new DescribeNodesInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodesInstanceTypeRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
