// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDatabaseResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>07F6177E-6DE4-408A-BB4F-0723301340F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseResponseBody self = new DeleteDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
