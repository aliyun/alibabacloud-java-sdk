// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBProxyEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointResponseBody self = new ModifyDBProxyEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
