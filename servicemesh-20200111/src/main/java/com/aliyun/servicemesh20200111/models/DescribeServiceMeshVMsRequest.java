// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshVMsRequest extends TeaModel {
    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshVMsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshVMsRequest self = new DescribeServiceMeshVMsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshVMsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
