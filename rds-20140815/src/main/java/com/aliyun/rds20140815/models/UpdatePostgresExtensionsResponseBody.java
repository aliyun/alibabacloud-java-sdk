// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdatePostgresExtensionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePostgresExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostgresExtensionsResponseBody self = new UpdatePostgresExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePostgresExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
