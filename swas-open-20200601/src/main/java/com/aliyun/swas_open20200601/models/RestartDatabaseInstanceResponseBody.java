// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RestartDatabaseInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDatabaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDatabaseInstanceResponseBody self = new RestartDatabaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDatabaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
