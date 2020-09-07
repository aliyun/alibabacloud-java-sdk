// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressResponse self = new ModifyDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
