// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshClustersRequest self = new DescribeServiceMeshClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshClustersRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeServiceMeshClustersRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public DescribeServiceMeshClustersRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
