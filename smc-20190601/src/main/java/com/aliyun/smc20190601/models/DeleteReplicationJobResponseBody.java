// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteReplicationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicationJobResponseBody self = new DeleteReplicationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteReplicationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
