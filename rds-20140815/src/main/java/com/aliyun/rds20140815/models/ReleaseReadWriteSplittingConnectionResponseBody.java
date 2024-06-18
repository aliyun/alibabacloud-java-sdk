// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseReadWriteSplittingConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A77D650-27A1-4E08-AD9E-59008EDB6927</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseReadWriteSplittingConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseReadWriteSplittingConnectionResponseBody self = new ReleaseReadWriteSplittingConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseReadWriteSplittingConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
