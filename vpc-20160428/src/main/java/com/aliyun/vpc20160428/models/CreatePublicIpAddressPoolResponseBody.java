// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePublicIpAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the IP address pool.</p>
     */
    @NameInMap("PulbicIpAddressPoolId")
    public String pulbicIpAddressPoolId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IP address pool belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreatePublicIpAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicIpAddressPoolResponseBody self = new CreatePublicIpAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublicIpAddressPoolResponseBody setPulbicIpAddressPoolId(String pulbicIpAddressPoolId) {
        this.pulbicIpAddressPoolId = pulbicIpAddressPoolId;
        return this;
    }
    public String getPulbicIpAddressPoolId() {
        return this.pulbicIpAddressPoolId;
    }

    public CreatePublicIpAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePublicIpAddressPoolResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
