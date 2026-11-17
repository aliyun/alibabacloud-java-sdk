// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableOutputItemShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableOutputItemShareResponseBody body;

    public static EnableOutputItemShareResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOutputItemShareResponse self = new EnableOutputItemShareResponse();
        return TeaModel.build(map, self);
    }

    public EnableOutputItemShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableOutputItemShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableOutputItemShareResponse setBody(EnableOutputItemShareResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableOutputItemShareResponseBody getBody() {
        return this.body;
    }

}
