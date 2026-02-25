// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DisableSSLConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSSLConnectionResponseBody body;

    public static DisableSSLConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSSLConnectionResponse self = new DisableSSLConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DisableSSLConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSSLConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSSLConnectionResponse setBody(DisableSSLConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSSLConnectionResponseBody getBody() {
        return this.body;
    }

}
