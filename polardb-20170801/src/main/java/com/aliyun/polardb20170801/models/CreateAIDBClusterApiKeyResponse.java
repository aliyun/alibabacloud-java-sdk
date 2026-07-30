// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAIDBClusterApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAIDBClusterApiKeyResponseBody body;

    public static CreateAIDBClusterApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIDBClusterApiKeyResponse self = new CreateAIDBClusterApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIDBClusterApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIDBClusterApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAIDBClusterApiKeyResponse setBody(CreateAIDBClusterApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIDBClusterApiKeyResponseBody getBody() {
        return this.body;
    }

}
