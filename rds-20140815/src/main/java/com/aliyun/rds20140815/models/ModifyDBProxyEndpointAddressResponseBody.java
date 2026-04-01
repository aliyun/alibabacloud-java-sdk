// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50F6C32B-DD73-4DA1-ADA2-0EAF2B0FCD8A</p>
     */
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
