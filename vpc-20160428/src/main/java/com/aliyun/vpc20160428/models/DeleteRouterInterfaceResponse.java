// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouterInterfaceResponse self = new DeleteRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouterInterfaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
