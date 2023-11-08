// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailRequest extends TeaModel {
    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailRequest self = new DescribeServiceMeshDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshDetailRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
