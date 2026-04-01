// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeletePostgresExtensionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePostgresExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePostgresExtensionsResponseBody self = new DeletePostgresExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePostgresExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
