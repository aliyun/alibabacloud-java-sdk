// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteChangeSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteChangeSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetResponseBody self = new DeleteChangeSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChangeSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
