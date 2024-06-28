// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
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
