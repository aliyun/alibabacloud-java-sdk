// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6GatewaySpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpv6GatewaySpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6GatewaySpecResponseBody self = new ModifyIpv6GatewaySpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6GatewaySpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
