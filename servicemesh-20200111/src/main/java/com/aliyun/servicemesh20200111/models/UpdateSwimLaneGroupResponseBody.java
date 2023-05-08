// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSwimLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneGroupResponseBody self = new UpdateSwimLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
