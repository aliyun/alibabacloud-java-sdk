// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteGlobalAccelerationInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGlobalAccelerationInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalAccelerationInstanceResponse self = new DeleteGlobalAccelerationInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalAccelerationInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
