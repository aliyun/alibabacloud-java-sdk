// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSwimLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSwimLaneGroupResponseBody self = new CreateSwimLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSwimLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
