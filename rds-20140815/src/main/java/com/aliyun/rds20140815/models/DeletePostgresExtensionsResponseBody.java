// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeletePostgresExtensionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
