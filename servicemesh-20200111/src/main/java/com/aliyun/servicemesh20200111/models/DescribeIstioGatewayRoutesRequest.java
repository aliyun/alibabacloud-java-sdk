// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRoutesRequest extends TeaModel {
    /**
     * <p>The name of the ASM gateway.</p>
     */
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    /**
     * <p>The ASM instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeIstioGatewayRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRoutesRequest self = new DescribeIstioGatewayRoutesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRoutesRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DescribeIstioGatewayRoutesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
