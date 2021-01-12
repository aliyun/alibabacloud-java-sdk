// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBProxyEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressResponseBody self = new ModifyDBProxyEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
