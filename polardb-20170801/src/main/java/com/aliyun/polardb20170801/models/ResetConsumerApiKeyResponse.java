// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetConsumerApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetConsumerApiKeyResponseBody body;

    public static ResetConsumerApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumerApiKeyResponse self = new ResetConsumerApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ResetConsumerApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetConsumerApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetConsumerApiKeyResponse setBody(ResetConsumerApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetConsumerApiKeyResponseBody getBody() {
        return this.body;
    }

}
