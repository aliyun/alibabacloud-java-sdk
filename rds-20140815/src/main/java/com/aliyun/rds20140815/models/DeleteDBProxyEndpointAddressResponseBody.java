// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBProxyEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBProxyEndpointAddressResponseBody self = new DeleteDBProxyEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBProxyEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
