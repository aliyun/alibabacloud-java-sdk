// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StopDatabaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopDatabaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDatabaseInstanceResponseBody self = new StopDatabaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDatabaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
