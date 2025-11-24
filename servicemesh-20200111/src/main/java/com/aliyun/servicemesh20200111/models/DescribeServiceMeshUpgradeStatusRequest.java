// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshUpgradeStatusRequest extends TeaModel {
    /**
     * <p>The fully qualified names of ingress gateways in the ASM instance. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>istio-system:ingressgateway1,istio-system:ingressgateway2</p>
     */
    @NameInMap("AllIstioGatewayFullNames")
    public String allIstioGatewayFullNames;

    /**
     * <p>The IDs of the clusters on the data plane of the ASM instance. Separate multiple clusters with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>caeac85a793c94afbbb0a4bb20320****</p>
     */
    @NameInMap("GuestClusterIds")
    public String guestClusterIds;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11fd0027-c27e-41bb-a565-75583054****</p>
     */
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
