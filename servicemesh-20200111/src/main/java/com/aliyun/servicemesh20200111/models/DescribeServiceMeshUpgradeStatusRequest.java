// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshUpgradeStatusRequest extends TeaModel {
    @NameInMap("AllIstioGatewayFullNames")
    public String allIstioGatewayFullNames;

    @NameInMap("GuestClusterIds")
    public String guestClusterIds;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshUpgradeStatusRequest self = new DescribeServiceMeshUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshUpgradeStatusRequest setAllIstioGatewayFullNames(String allIstioGatewayFullNames) {
        this.allIstioGatewayFullNames = allIstioGatewayFullNames;
        return this;
    }
    public String getAllIstioGatewayFullNames() {
        return this.allIstioGatewayFullNames;
    }

    public DescribeServiceMeshUpgradeStatusRequest setGuestClusterIds(String guestClusterIds) {
        this.guestClusterIds = guestClusterIds;
        return this;
    }
    public String getGuestClusterIds() {
        return this.guestClusterIds;
    }

    public DescribeServiceMeshUpgradeStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
