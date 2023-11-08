// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshRequest extends TeaModel {
    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeClustersInServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshRequest self = new DescribeClustersInServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersInServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
