// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class InitializeKvstorePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public InitializeKvstorePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeKvstorePermissionResponse setBody(InitializeKvstorePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeKvstorePermissionResponseBody getBody() {
        return this.body;
    }

}
