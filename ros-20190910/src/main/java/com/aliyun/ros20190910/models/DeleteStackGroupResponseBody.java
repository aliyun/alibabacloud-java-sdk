// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStackGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackGroupResponseBody self = new DeleteStackGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStackGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
