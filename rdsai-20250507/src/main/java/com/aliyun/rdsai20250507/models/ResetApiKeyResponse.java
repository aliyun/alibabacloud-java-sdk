// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetApiKeyResponseBody body;

    public static ResetApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetApiKeyResponse self = new ResetApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ResetApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetApiKeyResponse setBody(ResetApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetApiKeyResponseBody getBody() {
        return this.body;
    }

}
