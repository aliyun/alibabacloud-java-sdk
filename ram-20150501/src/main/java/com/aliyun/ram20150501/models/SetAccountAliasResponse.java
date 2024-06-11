// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class SetAccountAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccountAliasResponseBody body;

    public static SetAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAliasResponse self = new SetAccountAliasResponse();
        return TeaModel.build(map, self);
    }

    public SetAccountAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccountAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccountAliasResponse setBody(SetAccountAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccountAliasResponseBody getBody() {
        return this.body;
    }

}
