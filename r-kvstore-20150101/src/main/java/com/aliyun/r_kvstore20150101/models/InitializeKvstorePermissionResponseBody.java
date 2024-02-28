// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class InitializeKvstorePermissionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeKvstorePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeKvstorePermissionResponseBody self = new InitializeKvstorePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeKvstorePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
