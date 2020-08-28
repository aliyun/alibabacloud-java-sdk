// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddGlobalAccelerationInstanceIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddGlobalAccelerationInstanceIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGlobalAccelerationInstanceIpResponse self = new AddGlobalAccelerationInstanceIpResponse();
        return TeaModel.build(map, self);
    }

}
