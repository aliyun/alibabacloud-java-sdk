// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBProxyEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointResponse self = new ModifyDBProxyEndpointResponse();
        return TeaModel.build(map, self);
    }

}
