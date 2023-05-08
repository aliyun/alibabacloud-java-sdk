// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIngressGatewaysRequest extends TeaModel {
    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeIngressGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressGatewaysRequest self = new DescribeIngressGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIngressGatewaysRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
