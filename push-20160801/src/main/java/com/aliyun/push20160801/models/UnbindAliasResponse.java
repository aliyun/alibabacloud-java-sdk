// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class UnbindAliasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindAliasResponseBody body;

    public static UnbindAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAliasResponse self = new UnbindAliasResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAliasResponse setBody(UnbindAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAliasResponseBody getBody() {
        return this.body;
    }

}
