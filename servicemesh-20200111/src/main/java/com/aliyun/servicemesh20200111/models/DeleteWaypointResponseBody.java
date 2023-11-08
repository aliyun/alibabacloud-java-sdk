// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteWaypointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWaypointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaypointResponseBody self = new DeleteWaypointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWaypointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
