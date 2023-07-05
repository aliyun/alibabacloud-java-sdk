// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpcEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointAttributeResponseBody self = new UpdateVpcEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
