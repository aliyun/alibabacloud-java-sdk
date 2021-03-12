// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncRobotMessageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SyncRobotMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncRobotMessageResponseBody self = new SyncRobotMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncRobotMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
