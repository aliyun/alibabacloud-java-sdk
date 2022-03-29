// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGatewaySecretDetailsRequest extends TeaModel {
    @NameInMap("IstioGatewayName")
    public String istioGatewayName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeGatewaySecretDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaySecretDetailsRequest self = new DescribeGatewaySecretDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaySecretDetailsRequest setIstioGatewayName(String istioGatewayName) {
        this.istioGatewayName = istioGatewayName;
        return this;
    }
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    public DescribeGatewaySecretDetailsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
