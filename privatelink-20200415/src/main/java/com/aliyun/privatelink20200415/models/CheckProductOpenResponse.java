// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckProductOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckProductOpenResponseBody body;

    public static CheckProductOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckProductOpenResponse self = new CheckProductOpenResponse();
        return TeaModel.build(map, self);
    }

    public CheckProductOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckProductOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckProductOpenResponse setBody(CheckProductOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckProductOpenResponseBody getBody() {
        return this.body;
    }

}
