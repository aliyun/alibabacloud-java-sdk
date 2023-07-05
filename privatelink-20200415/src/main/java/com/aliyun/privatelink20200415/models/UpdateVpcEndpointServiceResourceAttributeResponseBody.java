// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointServiceResourceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpcEndpointServiceResourceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointServiceResourceAttributeResponseBody self = new UpdateVpcEndpointServiceResourceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointServiceResourceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
