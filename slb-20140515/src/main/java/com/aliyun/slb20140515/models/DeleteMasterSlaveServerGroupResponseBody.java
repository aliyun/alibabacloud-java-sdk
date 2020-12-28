// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteMasterSlaveServerGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMasterSlaveServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMasterSlaveServerGroupResponseBody self = new DeleteMasterSlaveServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMasterSlaveServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
