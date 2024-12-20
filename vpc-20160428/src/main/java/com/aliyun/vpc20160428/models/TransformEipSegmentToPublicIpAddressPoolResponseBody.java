// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TransformEipSegmentToPublicIpAddressPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pippool-6wetvn6fumkgycssx****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4pcdvf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static TransformEipSegmentToPublicIpAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformEipSegmentToPublicIpAddressPoolResponseBody self = new TransformEipSegmentToPublicIpAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformEipSegmentToPublicIpAddressPoolResponseBody setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public TransformEipSegmentToPublicIpAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransformEipSegmentToPublicIpAddressPoolResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
