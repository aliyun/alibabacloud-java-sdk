// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RevokeContextDatabaseApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeContextDatabaseApiKeyResponseBody body;

    public static RevokeContextDatabaseApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeContextDatabaseApiKeyResponse self = new RevokeContextDatabaseApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public RevokeContextDatabaseApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeContextDatabaseApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeContextDatabaseApiKeyResponse setBody(RevokeContextDatabaseApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeContextDatabaseApiKeyResponseBody getBody() {
        return this.body;
    }

}
