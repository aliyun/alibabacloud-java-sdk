// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewayAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNatGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewayAttributeResponse self = new ModifyNatGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

}
