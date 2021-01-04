// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class StopReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopReplicationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopReplicationJobResponseBody self = new StopReplicationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopReplicationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
