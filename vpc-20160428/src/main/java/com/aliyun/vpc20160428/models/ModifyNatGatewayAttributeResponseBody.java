// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AB5F62CF-2B60-4458-A756-42C9DFE108D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNatGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeResponseBody self = new ModifyNatGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
