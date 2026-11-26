// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplacePersonalSourceObjectBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplacePersonalSourceObjectBindingsResponseBody body;

    public static ReplacePersonalSourceObjectBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplacePersonalSourceObjectBindingsResponse self = new ReplacePersonalSourceObjectBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ReplacePersonalSourceObjectBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplacePersonalSourceObjectBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplacePersonalSourceObjectBindingsResponse setBody(ReplacePersonalSourceObjectBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplacePersonalSourceObjectBindingsResponseBody getBody() {
        return this.body;
    }

}
