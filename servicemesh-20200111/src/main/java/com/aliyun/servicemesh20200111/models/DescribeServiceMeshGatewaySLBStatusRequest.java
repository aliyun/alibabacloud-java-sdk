// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshGatewaySLBStatusRequest extends TeaModel {
    @NameInMap("GatewayAddresses")
    public String gatewayAddresses;

    @NameInMap("GatewayFullName")
    public String gatewayFullName;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshGatewaySLBStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshGatewaySLBStatusRequest self = new DescribeServiceMeshGatewaySLBStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshGatewaySLBStatusRequest setGatewayAddresses(String gatewayAddresses) {
        this.gatewayAddresses = gatewayAddresses;
        return this;
    }
    public String getGatewayAddresses() {
        return this.gatewayAddresses;
    }

    public DescribeServiceMeshGatewaySLBStatusRequest setGatewayFullName(String gatewayFullName) {
        this.gatewayFullName = gatewayFullName;
        return this;
    }
    public String getGatewayFullName() {
        return this.gatewayFullName;
    }

    public DescribeServiceMeshGatewaySLBStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
