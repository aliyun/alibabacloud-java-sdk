// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A07EF215-B9B3-8CB2-2899-3F9575C6E320</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUserFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupResponseBody self = new RemoveUserFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
