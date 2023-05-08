// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVMsInServiceMeshRequest extends TeaModel {
    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeVMsInServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVMsInServiceMeshRequest self = new DescribeVMsInServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVMsInServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
