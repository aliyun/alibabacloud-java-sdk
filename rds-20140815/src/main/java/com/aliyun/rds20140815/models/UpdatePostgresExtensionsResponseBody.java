// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdatePostgresExtensionsResponseBody extends TeaModel {
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
