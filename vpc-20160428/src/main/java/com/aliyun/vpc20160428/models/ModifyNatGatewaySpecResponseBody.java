// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecResponseBody extends TeaModel {
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
