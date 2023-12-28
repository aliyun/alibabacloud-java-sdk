// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeleteFailureMsgResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFailureMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailureMsgResponseBody self = new DeleteFailureMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFailureMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
