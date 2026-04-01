// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseInstanceConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseInstanceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceConnectionResponseBody self = new ReleaseInstanceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
