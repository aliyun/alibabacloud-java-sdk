// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6B50D92C-1960-4D4F-A290-AFADD6B1A5C8</p>
     */
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
