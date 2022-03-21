// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncResourceOperationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SyncResourceOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncResourceOperationResponseBody self = new SyncResourceOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncResourceOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
