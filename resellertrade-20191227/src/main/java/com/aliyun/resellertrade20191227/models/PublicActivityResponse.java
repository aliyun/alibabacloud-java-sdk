// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class PublicActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublicActivityResponseBody body;

    public static PublicActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        PublicActivityResponse self = new PublicActivityResponse();
        return TeaModel.build(map, self);
    }

    public PublicActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublicActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublicActivityResponse setBody(PublicActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public PublicActivityResponseBody getBody() {
        return this.body;
    }

}
