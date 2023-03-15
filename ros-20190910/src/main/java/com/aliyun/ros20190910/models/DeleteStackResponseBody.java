// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackResponseBody self = new DeleteStackResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
