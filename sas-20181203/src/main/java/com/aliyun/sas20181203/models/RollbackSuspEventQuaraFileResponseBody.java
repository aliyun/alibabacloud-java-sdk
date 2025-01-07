// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>52A3AEE6-114A-499D-8990-4BA9B27FE0AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackSuspEventQuaraFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileResponseBody self = new RollbackSuspEventQuaraFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
