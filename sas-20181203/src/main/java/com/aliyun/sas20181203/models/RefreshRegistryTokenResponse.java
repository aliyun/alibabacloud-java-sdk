// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshRegistryTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshRegistryTokenResponseBody body;

    public static RefreshRegistryTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshRegistryTokenResponse self = new RefreshRegistryTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshRegistryTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshRegistryTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshRegistryTokenResponse setBody(RefreshRegistryTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshRegistryTokenResponseBody getBody() {
        return this.body;
    }

}
