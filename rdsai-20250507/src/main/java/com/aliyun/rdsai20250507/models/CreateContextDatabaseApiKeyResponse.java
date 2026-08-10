// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContextDatabaseApiKeyResponseBody body;

    public static CreateContextDatabaseApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseApiKeyResponse self = new CreateContextDatabaseApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContextDatabaseApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContextDatabaseApiKeyResponse setBody(CreateContextDatabaseApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContextDatabaseApiKeyResponseBody getBody() {
        return this.body;
    }

}
