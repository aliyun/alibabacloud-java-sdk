// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBProxyEndpointAddressResponse self = new CreateDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBProxyEndpointAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
