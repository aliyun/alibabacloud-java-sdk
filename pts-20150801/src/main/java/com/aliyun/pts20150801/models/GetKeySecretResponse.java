// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class GetKeySecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeySecretResponseBody body;

    public static GetKeySecretResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeySecretResponse self = new GetKeySecretResponse();
        return TeaModel.build(map, self);
    }

    public GetKeySecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeySecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeySecretResponse setBody(GetKeySecretResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeySecretResponseBody getBody() {
        return this.body;
    }

}
