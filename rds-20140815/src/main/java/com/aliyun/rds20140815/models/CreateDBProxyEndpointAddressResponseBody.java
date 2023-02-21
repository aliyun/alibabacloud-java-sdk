// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBProxyEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBProxyEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBProxyEndpointAddressResponseBody self = new CreateDBProxyEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBProxyEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
