// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnablePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static EnablePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnablePhysicalConnectionResponse self = new EnablePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnablePhysicalConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
