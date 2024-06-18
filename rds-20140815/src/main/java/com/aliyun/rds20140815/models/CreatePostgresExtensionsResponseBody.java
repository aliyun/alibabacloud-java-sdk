// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreatePostgresExtensionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePostgresExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePostgresExtensionsResponseBody self = new CreatePostgresExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePostgresExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
