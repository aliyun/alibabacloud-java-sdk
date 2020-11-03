// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteGreConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGreConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreConnectionResponse self = new DeleteGreConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGreConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
