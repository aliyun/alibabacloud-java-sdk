// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateGlobalAccelerationInstanceResponse self = new UnassociateGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

}
