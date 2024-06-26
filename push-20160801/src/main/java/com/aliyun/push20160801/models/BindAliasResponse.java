// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAliasResponseBody body;

    public static BindAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAliasResponse self = new BindAliasResponse();
        return TeaModel.build(map, self);
    }

    public BindAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAliasResponse setBody(BindAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAliasResponseBody getBody() {
        return this.body;
    }

}
