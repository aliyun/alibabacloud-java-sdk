// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteSourceServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSourceServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceServerResponseBody self = new DeleteSourceServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSourceServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
