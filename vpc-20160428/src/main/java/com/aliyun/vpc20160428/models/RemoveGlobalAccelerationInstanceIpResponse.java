// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveGlobalAccelerationInstanceIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveGlobalAccelerationInstanceIpResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGlobalAccelerationInstanceIpResponse self = new RemoveGlobalAccelerationInstanceIpResponse();
        return TeaModel.build(map, self);
    }

}
