// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointConnectionAttributeResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpcEndpointConnectionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointConnectionAttributeResponseBody self = new UpdateVpcEndpointConnectionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointConnectionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
