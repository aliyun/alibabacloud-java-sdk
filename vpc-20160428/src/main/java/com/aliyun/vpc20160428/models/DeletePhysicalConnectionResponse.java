// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalConnectionResponse self = new DeletePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
