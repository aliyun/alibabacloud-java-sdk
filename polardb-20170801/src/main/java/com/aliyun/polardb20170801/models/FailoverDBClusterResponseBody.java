// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FailoverDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterResponseBody self = new FailoverDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
