// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckConnectionStringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckConnectionStringResponseBody body;

    public static CheckConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectionStringResponse self = new CheckConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public CheckConnectionStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckConnectionStringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckConnectionStringResponse setBody(CheckConnectionStringResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConnectionStringResponseBody getBody() {
        return this.body;
    }

}
