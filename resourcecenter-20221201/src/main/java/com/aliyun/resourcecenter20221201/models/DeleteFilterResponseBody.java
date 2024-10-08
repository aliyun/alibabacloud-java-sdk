// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteFilterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4A63E3C-89EC-51F9-9934-C9AF1BCBAAA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterResponseBody self = new DeleteFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
