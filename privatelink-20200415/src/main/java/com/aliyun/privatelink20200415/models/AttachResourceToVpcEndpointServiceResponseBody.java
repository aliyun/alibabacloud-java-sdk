// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AttachResourceToVpcEndpointServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachResourceToVpcEndpointServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachResourceToVpcEndpointServiceResponseBody self = new AttachResourceToVpcEndpointServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachResourceToVpcEndpointServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
