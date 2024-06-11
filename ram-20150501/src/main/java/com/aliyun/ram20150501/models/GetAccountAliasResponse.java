// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccountAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountAliasResponseBody body;

    public static GetAccountAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAliasResponse self = new GetAccountAliasResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountAliasResponse setBody(GetAccountAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountAliasResponseBody getBody() {
        return this.body;
    }

}
