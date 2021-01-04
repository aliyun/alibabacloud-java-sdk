// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class StartReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartReplicationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartReplicationJobResponseBody self = new StartReplicationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartReplicationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
