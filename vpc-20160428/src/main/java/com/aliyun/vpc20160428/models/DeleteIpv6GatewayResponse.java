// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6GatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteIpv6GatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6GatewayResponse self = new DeleteIpv6GatewayResponse();
        return TeaModel.build(map, self);
    }

}
