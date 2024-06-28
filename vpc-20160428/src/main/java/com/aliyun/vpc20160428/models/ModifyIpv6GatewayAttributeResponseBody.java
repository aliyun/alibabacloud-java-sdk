// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFEDBEE-E5AB-49E8-A2DC-CC114C67AF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpv6GatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewayAttributeResponseBody self = new ModifyIpv6GatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
