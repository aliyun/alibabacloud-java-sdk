// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreatePostgresExtensionsResponseBody extends TeaModel {
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