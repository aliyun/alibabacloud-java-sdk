// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceObjectBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceObjectBindingsResponseBody body;

    public static ReplaceObjectBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceObjectBindingsResponse self = new ReplaceObjectBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceObjectBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceObjectBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceObjectBindingsResponse setBody(ReplaceObjectBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceObjectBindingsResponseBody getBody() {
        return this.body;
    }

}
