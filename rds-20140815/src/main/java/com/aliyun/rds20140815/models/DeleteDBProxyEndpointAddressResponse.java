// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBProxyEndpointAddressResponse self = new DeleteDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBProxyEndpointAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
