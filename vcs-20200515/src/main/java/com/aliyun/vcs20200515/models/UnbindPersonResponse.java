// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UnbindPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindPersonResponseBody body;

    public static UnbindPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPersonResponse self = new UnbindPersonResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindPersonResponse setBody(UnbindPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPersonResponseBody getBody() {
        return this.body;
    }

}
