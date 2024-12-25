// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteMasterSlaveServerGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
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
