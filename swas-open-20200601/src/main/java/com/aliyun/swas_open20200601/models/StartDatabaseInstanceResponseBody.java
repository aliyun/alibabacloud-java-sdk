// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class StartDatabaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDatabaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDatabaseInstanceResponseBody self = new StartDatabaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDatabaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
