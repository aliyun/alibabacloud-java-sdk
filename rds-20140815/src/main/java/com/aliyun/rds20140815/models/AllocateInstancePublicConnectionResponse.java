// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AllocateInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponse self = new AllocateInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
