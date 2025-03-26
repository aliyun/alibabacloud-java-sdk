// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePublicIpAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the IP address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-6wetvn6fumkgycssx****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The ID of the IP address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-6wetvn6fumkgycssx****</p>
     */
    @NameInMap("PulbicIpAddressPoolId")
    @Deprecated
    public String pulbicIpAddressPoolId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the IP address pool belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4pcdvf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreatePublicIpAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicIpAddressPoolResponseBody self = new CreatePublicIpAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublicIpAddressPoolResponseBody setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    @Deprecated
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
