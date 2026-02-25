// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class EnableSSLConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSSLConnectionResponseBody body;

    public static EnableSSLConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSSLConnectionResponse self = new EnableSSLConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableSSLConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSSLConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSSLConnectionResponse setBody(EnableSSLConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSSLConnectionResponseBody getBody() {
        return this.body;
    }

}
