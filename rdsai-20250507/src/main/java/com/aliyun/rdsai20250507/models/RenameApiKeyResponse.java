// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RenameApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameApiKeyResponseBody body;

    public static RenameApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameApiKeyResponse self = new RenameApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public RenameApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameApiKeyResponse setBody(RenameApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameApiKeyResponseBody getBody() {
        return this.body;
    }

}
