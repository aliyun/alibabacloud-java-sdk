// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteStackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackResponse self = new DeleteStackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
