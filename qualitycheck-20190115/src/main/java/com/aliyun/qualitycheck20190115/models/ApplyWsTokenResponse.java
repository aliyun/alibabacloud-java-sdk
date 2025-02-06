// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ApplyWsTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyWsTokenResponseBody body;

    public static ApplyWsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyWsTokenResponse self = new ApplyWsTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyWsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyWsTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyWsTokenResponse setBody(ApplyWsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyWsTokenResponseBody getBody() {
        return this.body;
    }

}
