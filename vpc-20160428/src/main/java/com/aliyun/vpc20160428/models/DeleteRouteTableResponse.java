// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRouteTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteTableResponse self = new DeleteRouteTableResponse();
        return TeaModel.build(map, self);
    }

}
