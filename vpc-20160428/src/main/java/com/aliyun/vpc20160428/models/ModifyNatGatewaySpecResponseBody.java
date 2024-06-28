// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DBD4E4A2-786E-4BD2-8EB6-107FFC2B5B7D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatGatewaySpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewaySpecResponseBody self = new ModifyNatGatewaySpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewaySpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
