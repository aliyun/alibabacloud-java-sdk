// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableResponse self = new AssociateRouteTableResponse();
        return TeaModel.build(map, self);
    }

}
