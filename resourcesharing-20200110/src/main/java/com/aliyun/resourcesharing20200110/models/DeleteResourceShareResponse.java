// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DeleteResourceShareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceShareResponse self = new DeleteResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceShareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
