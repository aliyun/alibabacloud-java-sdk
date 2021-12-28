// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshGatewayPodStatusRequest extends TeaModel {
    @NameInMap("GatewayFullName")
    public String gatewayFullName;

    @NameInMap("GuestClusterIds")
    public String guestClusterIds;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshGatewayPodStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshGatewayPodStatusRequest self = new DescribeServiceMeshGatewayPodStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshGatewayPodStatusRequest setGatewayFullName(String gatewayFullName) {
        this.gatewayFullName = gatewayFullName;
        return this;
    }
    public String getGatewayFullName() {
        return this.gatewayFullName;
    }

    public DescribeServiceMeshGatewayPodStatusRequest setGuestClusterIds(String guestClusterIds) {
        this.guestClusterIds = guestClusterIds;
        return this;
    }
    public String getGuestClusterIds() {
        return this.guestClusterIds;
    }

    public DescribeServiceMeshGatewayPodStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
