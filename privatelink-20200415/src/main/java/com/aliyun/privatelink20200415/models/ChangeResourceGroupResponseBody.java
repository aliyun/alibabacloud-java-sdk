// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D8992C1-6712-423C-BAC5-E5E817484C6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
