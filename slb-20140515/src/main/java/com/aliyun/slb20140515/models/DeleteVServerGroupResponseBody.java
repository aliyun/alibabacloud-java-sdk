// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteVServerGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVServerGroupResponseBody self = new DeleteVServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
