// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class DeleteRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunResponseBody self = new DeleteRunResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
