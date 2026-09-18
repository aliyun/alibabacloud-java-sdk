// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReparseGroupSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReparseGroupSourceResponseBody body;

    public static ReparseGroupSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReparseGroupSourceResponse self = new ReparseGroupSourceResponse();
        return TeaModel.build(map, self);
    }

    public ReparseGroupSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReparseGroupSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReparseGroupSourceResponse setBody(ReparseGroupSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReparseGroupSourceResponseBody getBody() {
        return this.body;
    }

}
