// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcEndpointServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointServiceResponseBody self = new DeleteVpcEndpointServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
