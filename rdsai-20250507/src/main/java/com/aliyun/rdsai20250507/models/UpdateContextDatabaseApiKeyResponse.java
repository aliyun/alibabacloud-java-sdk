// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContextDatabaseApiKeyResponseBody body;

    public static UpdateContextDatabaseApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseApiKeyResponse self = new UpdateContextDatabaseApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContextDatabaseApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContextDatabaseApiKeyResponse setBody(UpdateContextDatabaseApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContextDatabaseApiKeyResponseBody getBody() {
        return this.body;
    }

}
