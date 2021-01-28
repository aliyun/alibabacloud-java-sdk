// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class InitializeKvstorePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeKvstorePermissionResponseBody body;

    public static InitializeKvstorePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeKvstorePermissionResponse self = new InitializeKvstorePermissionResponse();
        return TeaModel.build(map, self);
    }

    public InitializeKvstorePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeKvstorePermissionResponse setBody(InitializeKvstorePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeKvstorePermissionResponseBody getBody() {
        return this.body;
    }

}
