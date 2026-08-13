// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReparseSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReparseSourceResponseBody body;

    public static ReparseSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReparseSourceResponse self = new ReparseSourceResponse();
        return TeaModel.build(map, self);
    }

    public ReparseSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReparseSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReparseSourceResponse setBody(ReparseSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReparseSourceResponseBody getBody() {
        return this.body;
    }

}
