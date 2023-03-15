// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelUpdateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackResponseBody self = new CancelUpdateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
