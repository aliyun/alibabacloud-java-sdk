// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConnectRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceResponseBody self = new ConnectRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConnectRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
