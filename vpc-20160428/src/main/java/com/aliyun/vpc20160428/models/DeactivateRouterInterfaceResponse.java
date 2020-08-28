// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactivateRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeactivateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateRouterInterfaceResponse self = new DeactivateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

}
